package Encapsulations;
class Person {
    private String name; // Private variable (cannot be accessed directly)

    // Setter method to set the value
    public void setName(String newName) {
        name = newName;
    }

    // Getter method to get the value
    public String getName() {
        return name;
    }
}
public class Main {
    public static void main(String[] args) {

        Personn p = new Personn();
        p.setName("John"); // Setting value
        System.out.println(p.getName()); // Getting value

    }
}


