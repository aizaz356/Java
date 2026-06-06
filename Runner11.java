import java.util.Vector;      // import Vector class from java.util package

public class Runner11 {

    public void printVector(Vector v) {
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));  // print each element of the vector
        }
    }

    public void intVectorTest() {
        Vector vi = new Vector(); 
        vi.add(4);
        vi.add(5);
        vi.add("something");

        printVector(vi);  // print the contents of the vector
        // System.out.println(vi);    // can also output directly

    }

//   public void stringVectorTest() {
//        Vector<String> vs = new Vector<String>();   // specify type of vector
//        vs.add("first");
//        vs.add("second");
//        vs.add(third);  
//
//        System.out.println(vs);  // print the contents of the vector
//
//}


public static void main(String args[]) {
        Runner11 r = new Runner11();
        r.intVectorTest();  // test the int vector

        // r.stringVectorTest();  // test the string vector

        // comment out intvectorTest definition to get rid of warning
    }
}



// add a CLI argument 