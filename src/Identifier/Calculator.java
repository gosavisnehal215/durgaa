package Identifier;
//what is good naming convention ?

//  Class name is meaningful and uses PascalCase
public class Calculator {

    //  Variable names are clear
    private int firstNumber, secondNumber;

    //  Constructor name matches class name and parameters are descriptive
    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    //  Method name is meaningful
    void calculateSum() {
        System.out.println("Sum is: " + (firstNumber + secondNumber));
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(5, 10);
        calc.calculateSum();  //  Easy to understand what this method does
    }
}
