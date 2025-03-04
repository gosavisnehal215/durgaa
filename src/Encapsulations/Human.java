package Encapsulations;
// Encapsulation Example - Private Variables with Getters and Setters
class Personn {
    private String name;  // Private variable
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String newName) {
        this.name = newName;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int newAge) {
        if (newAge > 0) { // Validating age
            this.age = newAge;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class Human {
    public static void main(String[] args) {
        Personn p = new Personn();

        // Setting values using setter methods
        p.setName("John");
        p.setAge(25);

        // Getting values using getter methods
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}

