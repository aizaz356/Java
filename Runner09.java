interface Plugin {
    // serves as a contract
    public  void draw();
    public  void save();
}


class TextEditorPlugin implements Plugin {
        @Override
        public void draw() {
        System.out.println("Drawing text");
    }

        @Override
        public void save() {
        System.out.println("Saved text");
    }
}

//class PDFViewerPlugin implements Plugin {                 //  if we initialize one class the other class and its functions are comments //
        //@Override
        //public void draw() {
        //System.out.println("Showing PDF");
    //}

        //@Override
        //public void save() {                           
        //System.out.println("Saved PDF annotations");
    //}
//}

public class Runner09 {
    public static void main(String args[]) {
        // assume this is your atom editor
                                                        
        TextEditorPlugin p = new TextEditorPlugin();    // reference variable of interference can hold implementing class object
        //PDFViewerPlugin p = new PDFViewerPlugin();   

        p.draw();
        p.save();
    }
}