public class Student03 {
    static int num = 0;
    int rollNo;


    public static void main(String args[]) {
        Student03  s1 = new Student03();         // create an instance(object) of new Student03 class and assign it to s1
        Student03  s2 = new Student03();         // create another instance(object) of new Student03 class and assign it to s2

        System.out.println("num: " + Student03.num);

        Student03.num += 1;                      // Student03.num = Student03.num + 1;          // Increment the static variable num by 1 using the class name Student03
        System.out.println("num: " + Student03.num);

        //System.out.println("s1.num: " + s1.num);           // num is a static variable, so it is accessed using the class name Student03, not through the object reference s1  // So, this line is commented out to avoid confusion, as it is not the recommended way to access static variables. Static variables should be accessed using the class name, not through object references.
        //System.out.println("s2.num: " + s2.num);           // num is a static variable, so it is accessed using the class name Student03, not through the object reference s2  // So, this line is commented out to avoid confusion, as it is not the recommended way to access static variables. Static variables should be accessed using the class name, not through object references.
        System.out.println("s1.num: " + Student03.num);     // num is a static variable, so it is accessed using the class name Student03
        System.out.println("s2.num: " + Student03.num);     // num is a static variable, so it is accessed using the class name Student03

        System.out.println("rollNo:" + s1.rollNo);          // rollNo is an instance -> object(non-static) variable, so it is accessed using the object reference s1
        System.out.println("rollNo:" + s2.rollNo);          // rollNo is an instance -> object(non-static) variable, so it is accessed using the object reference s2
    }  
}