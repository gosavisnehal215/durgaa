package Polymorphism;

class MathOperation {

    int add(int a, int b) { //add is method
        return a + b;      // Addition with two integers
    }


    int add(int a, int b, int c) {
        return a + b + c;    //// Addition with three integers
    }


    double add(double a, double b) {
        return a + b;     //// Addition with two double values
    }
}

public class M_OL {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        System.out.println("Sum of 2 numbers: " + obj.add(5, 10));
        System.out.println("Sum of 3 numbers: " + obj.add(5, 10, 15));
        System.out.println("Sum of 2 double numbers: " + obj.add(5.5, 10.5));
    }
}


