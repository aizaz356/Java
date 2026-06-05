public class Intro01 {                            // class is public and named Intro01
    public static void main(String args[]) {      // public function, args is command-line argument of type String array,[] is array   // String args[] is an array of strings, which can hold multiple string values. It is used to pass command-line arguments to the main method when the program is executed.
        System.out.println("Hello world!");       // System is a class, out is a static member of System class, println is a method of out class
        //System.out.println(args[0]);          // args[0] is the first element of the args array, which is the first command-line argument passed to the program
        //System.out.println(args[1]);          // args[1] is the second element of the args array, which is the second command-line argument passed to the program
    }
}




// add a CLI argument