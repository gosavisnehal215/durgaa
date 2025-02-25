package Identifier;

//what is identifier ?

public class IdentifierExample {
    // Valid identifiers
    int myNumber = 10;       // Variable
    static String name = "Java";  // Variable with

    public static void main(String[] args) {
        IdentifierExample obj = new IdentifierExample(); // Class name identifier
        obj.displayMessage();  // Method name identifier
    }

    void displayMessage() {
        System.out.println("Hello, Java Identifiers!");
    }
}
