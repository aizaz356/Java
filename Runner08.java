abstract class Polygon {
    int numSides;

    public Polygon(int numSides) {
        this.numSides = numSides;
    }

    // 01: add abstract, then make class abstract then don't instantiate
    public abstract double getArea(); // {
        //return 2.0;
    //}
}

class Rectangle extends Polygon {

    public Rectangle() {
        super(4);
    }

    double length;
    double width;
    public void setSides(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}


public class Runner08 {
    public static void main(String args[]) {
        //Polygon p = new Polygon(3);  // cannot instantiate abstract class
        //System.out.println("Area of poly: " + p.getArea());  // this does not make sense .. make it

        //Rectangle r = new Rectangle();
        Polygon r = new Rectangle();    // 02 -- parent class reference var(variable), child object   // In this,a Parent class reference variable can access/refer to the child instance(object) this is called "polymorphism"  but it can used  only the methods that are declared in the parent class. It cannot used the methods that are specific to the child class.

        //r.setSides(4, 4);
        System.out.println("Area of rect: " + r.getArea());
    }
}