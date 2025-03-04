package Inheritance;
//what happen when child class use parent class method with same ans ansme aparameter

class Parent1 {
    void show() { // method
        System.out.println("this is parent class method ");
    }
}

class Child1 extends Parent1{
   @Override
    void show(){//method
        System.out.println("this is child class method ");
    }
}
public class Que_10 {
    public static void main(String[] args) {
        Parent1 obj1 = new Parent1();
        obj1.show();// call parent class method

        Child1 obj2= new Child1();
        obj2.show();//call child class method

        Parent1 obj3 = new Child1(); //runtime polymorphism
        obj3.show();


    }


}
