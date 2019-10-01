package anwar.com;

/* class Shape{
    void draw(){
        System.out.println("Drawing a Shape");
    }
} */
/*
abstract class Shape{
    Shape(){
        System.out.println("Shape is Constructed");
    }
    abstract void draw(); // no def
}
*/

/*
class Circle extends Shape{
    void draw() {  // overriding
        System.out.println("Drawing a Circle");
    }
}

class Polygon extends Shape{
    void draw() {
        System.out.println("Drawing a Polygon");
    }
}
*/

interface Shape{
    void draw(); // public abstract void draw();
}

class Circle implements Shape{
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape{
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Polygon implements Shape{
    public void draw() {
        System.out.println("Drawing a Polygon");
    }
}

public class AbstractInterfaceClass {
    public static void main(String[] args){
       /*  Shape s;
        s = new Shape();
        s.draw();

        Circle c;
        c = new Circle();
        c.draw(); */

       // Run Time Polymorphism
       Shape s;
       s = new Circle() ;  // Polymorphic Statement
        s.draw();

        s = new Polygon();
        s.draw();

        s = new Rectangle();
        s.draw();
    }
}

