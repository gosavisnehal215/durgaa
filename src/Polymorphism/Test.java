package Polymorphism;

class Parent{
    static void show(){
        System.out.println("parent static method");
    }
}

class child extends Parent{
    static void show()
        {
            System.out.println("child static method");
        }
    }
public class Test {
    public static void main(String[] args) {
      //  Parent obj = new child();
        Parent obj = new Parent();
        obj.show();

        child c= new child();
        c.show();



    }
}
