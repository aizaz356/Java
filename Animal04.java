public class Animal04 {

    public Animal04() {
        // Constructor
        System.out.println("Animal class created ...");
    }

    // java doesn't have a destructor

    public static void main(String args[]) {
        System.out.println("Main function called ... ");

        Animal04 a = new Animal04();    // Create an instance(object) of the new class(Animal04)
        System.out.println(a);          // Print the reference to the object a // This "uses" the reference variable a
    }  
}