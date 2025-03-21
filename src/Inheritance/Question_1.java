package Inheritance;

class Parent { // parent class
    void show() { // method
        System.out.println("This is Parent class");
    }
}

class Child extends Parent { //child class
    void display() {
        System.out.println("This is Child class");
    }
}
public class Question_1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();   // Inherited method
        obj.display();
    }

}
