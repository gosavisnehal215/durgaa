package Polymorphism;

// Abstract class
abstract class Shape {
    abstract void draw();
}

// Subclass Circle
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class With_Abstract {
    public static void main(String[] args) {
        Shape myShape;

        myShape = new Circle();
        myShape.draw();

        myShape = new Rectangle();
        myShape.draw();
    }
}

