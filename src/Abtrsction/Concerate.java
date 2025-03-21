package Abtrsction;

//Can an abstract class have concrete methods (i.e., methods with a body)?

abstract class Appliance{
    abstract void turnOn(); // abstracct method

    void plugIn(){//concrete method (regular mehtod)
        System.out.println("Appliance is pugged in");

    }
}
class Fan extends Appliance{
    void turnOn(){ //implement absatrct method
        System.out.println("Fan is tuning on...");
    }
}
public class Concerate {
    public static void main(String[] args) {
        Fan myFan = new Fan();
        myFan.plugIn();//calling concret method
        myFan.turnOn();//calling abstarct method

    }
}
