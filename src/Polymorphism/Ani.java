package Polymorphism;

 class New {
    void eat(){
        System.out.println("eating....");
    }
    class Dog extends New {
        void eat() {
            System.out.println("eating bread.....");
        }

        class Cat extends New {
            void eat() {
                System.out.println("eating milk");
            }
        }
    }}

public class Ani {
    public static void main(String[] args) {


    }

}