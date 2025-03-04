package Abtrsction;
abstract class Bird {
    abstract void sound();
}
class Sparrow extends Bird{

    void sound() {
        System.out.println("Sparrow chirpls");
    }
}
public class First {
    public static void main(String[] args) {
      Sparrow mySparow = new Sparrow();
mySparow.sound();}
}
