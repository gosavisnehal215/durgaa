package Polymorphism;

class Student {
    String name;
    int age;

    // Constructor with one parameter
    Student(String name) {
        this.name = name;
        this.age = 18; // Default age
    }

    // Constructor with two parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class OL_Constrctor {
    public static void main(String[] args) {
        Student s1 = new Student("Krushna");
        Student s2 = new Student("Somanath", 22);

        s1.display();
        s2.display();
    }
}

