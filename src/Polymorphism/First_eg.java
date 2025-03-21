package Polymorphism;

class Person{
     void role(){
         System.out.println(" I am a person");
     }
}

class Father extends Person{
    void role(){
        System.out.println(" I am father ");
    }
}
public class First_eg {
    public static void main(String[] args) {
        Father obj = new Father();
        obj.role();

        Person p = new Person();
        p.role();
    }
}
