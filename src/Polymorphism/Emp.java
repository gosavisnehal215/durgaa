package Polymorphism;
// Polymorphism Using Abstract Classes


// Abstract class
abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Abstract method
    abstract double calculateBonus();
}

// Full-time Employee
class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.10; // 10% bonus
    }
}

// Part-time Employee
class PartTimeEmployee extends Employee {
    PartTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.05; // 5% bonus
    }
}

public class Emp {
    public static void main(String[] args) {
        Employee emp;

        emp = new FullTimeEmployee("Krushna", 53450);
        System.out.println(emp.name + "'s Bonus: $" + emp.calculateBonus());

        emp = new PartTimeEmployee("Somanath", 26700);
        System.out.println(emp.name + "'s Bonus: $" + emp.calculateBonus());
    }
}


