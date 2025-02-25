package Abstarct_class;

//by using constructor in parent class
abstract class Human {
    String name; // instance variable
    int age;

    Human(String name, int age) { // constructor
        this.name = name;
        this.age = age;

    }

    class student extends Human {
        int roll;
        double salary;

        student(String name, int age, int roll, int salary) {
            super(name, age);
            this.roll = roll;
            this.salary = salary;
        }

        // To display the details of the student
        void display() { // normal method
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Roll: " + roll);
            System.out.println("Salary: " + salary);




        }


    }

public class Person{
    public static void main(String[] args) {
        student S = new student("krushna",34 ,43 ,4444);

    }
}
}