package Abtrsction;

abstract class Monekey {
    abstract void shout();//abstract method

    void cry(){
        System.out.println("monkey is crying");
    }
}

class Fox extends Monekey{
    void shout(){
        System.out.println("fox is shoting on monkey");

    }

}

public class Dog1 {
    public static void main(String[] args) {
     /*   Monekey m = new Fox();

        m.cry();
        m.shout();

      */

        Fox f= new Fox();



        f.cry();
        f.shout();
    }
}

