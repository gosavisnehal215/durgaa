/*
package Inheritance;
class SmartDevice {
    String deviceName;

    SmartDevice(String name) {
        this.deviceName = name;
    }

    void turnOn() {
        System.out.println(deviceName + " is now ON.");
    }

    void turnOff() {
        System.out.println(deviceName + " is now OFF.");
    }
}

class SmartLight extends SmartDevice{
    SmartLight(String name){
        super(name);
    }
    void changerBrightness(int level){
        System.out.println(deviceName+"brightness set to "+level+"%");

    }
}
//Another Derived class: Smart thermostat extends smartDevice
class SmartThermostat extends SmartDevice{
    SmartThermostat(String name){
        super(name );

    }
    void setTemperature(int temp){
        System.out.println(deviceName+ "temperture set to "+temp+"°C");
    }
    @Override
    void turnOn() {
        System.out.println(deviceName + " is now ON. Heating/Cooling activated.");
    }
}
public class SmartHome {
    public static void main(String[] args) {
        SmartLight livingRoomLight = new SmartLight("Living Room Light");
        SmartThermostat homeThermostat = new SmartThermostat("Home Thermostat");

        livingRoomLight.turnOn();
        livingRoomLight.changeBrightness(75);
        livingRoomLight.turnOff();

        System.out.println();

        homeThermostat.turnOn();
        homeThermostat.setTemperature(22);
        homeThermostat.turnOff();
    }



}


*/
