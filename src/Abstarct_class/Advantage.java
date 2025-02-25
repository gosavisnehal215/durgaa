package Abstarct_class;
//advantage of abstarct class

  abstract class Vehichals{
    String brand;
    int roll;
    Vehichals(String brand ){ //construtor
        this.brand=brand;
    }

    abstract void start(); //abstarct method

    void stop(){ // normal method
        System.out.println(brand +"is sssstopping.");
    }
}
//first child class
class car extends Vehichals{

      car(String brand){ //constructor implemention
          super(brand);

      }

      void start(){
          System.out.println(brand + "car is starting with key.");
      }

}
//2 child class
class Bike extends Vehichals{

      Bike(String brand){
          super(brand);

      }
      void start(){
          System.out.println(brand + "bike is start with kick");
      }
}
public class Advantage {
    public static void main(String[] args) {
        car mycar = new car("innova");
        mycar.stop();
        mycar.start();

        Bike mybike = new Bike("KTM");
        mybike.stop();
        mybike.start();

    }
}

