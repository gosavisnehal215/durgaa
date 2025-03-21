package Polymorphism;

class MathOperations {
    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double parameters
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        System.out.println(obj.add(5, 10));         // Calls int add(int, int)
        System.out.println(obj.add(5, 10, 15));     // Calls int add(int, int, int)
        System.out.println(obj.add(5.5, 2.3));      // Calls double add(double, double)
    }
}





