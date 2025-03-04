package Polymorphism;


// Interface
interface Vehicle {
    void start();
}

//// Class implementing interface
class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a key.");
    }
}

//// Another class implementing interface
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

public class WIth_Interface {
    public static void main(String[] args) {
        Vehicle myVehicle;

        myVehicle = new Car();
        myVehicle.start();

        myVehicle = new Bike();
        myVehicle.start();
    }
}


