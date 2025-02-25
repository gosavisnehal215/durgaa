package Identifier;

//good programing pratice delcreation ?


//  Class name follows PascalCase
public class EmployeeDetails {

    //  Constants are in ALL_CAPS with underscores
    private static final int MAX_AGE = 60;

    //  Variable names use camelCase
    private String employeeName;
    private double salaryAmount;

    //  Constructor name matches the class name
    public EmployeeDetails(String name, double salary) {
        this.employeeName = name;
        this.salaryAmount = salary;
    }

    //  Method names use camelCase
    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salaryAmount);
    }

    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails("John Doe", 50000);
        emp.displayEmployeeInfo();
    }
}
