package Encapsulations;
//what is read only encapsultion ?


class Student {
   // private String name = "Krushna"; // Private variable with a fixed value
   private String name = "krushna";
    // Getter method only (Read-Only)
    public String getName() {
        return name;
    }
}

public class Que_3 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName()); // Accessing the value
    }
}


