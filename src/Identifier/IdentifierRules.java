package Identifier;

public class IdentifierRules {  // ✅ "IdentifierRules" (Class name, follows rule 1)

    int myNumber = 10;  // ✅ Valid: Starts with a letter
    double $price = 99.99;  // ✅ Valid: Starts with "$"
    String _name = "John";  // ✅ Valid: Starts with "_"

    // ❌ Invalid identifier (Uncomment to see error)
    // int 2value = 50;   // ❌ Invalid: Starts with a digit
    // int class = 5;     // ❌ Invalid: "class" is a keyword
    // int my value = 20; // ❌ Invalid: Contains space

    public static void main(String[] args) {  // ✅ "main", "args" are valid identifiers
        IdentifierRules obj = new IdentifierRules();  // ✅ "obj" is a valid identifier
        obj.displayMessage();  // ✅ "displayMessage" is a valid method name
    }

    void displayMessage() {  // ✅ Valid identifier (follows naming rules)
        System.out.println("Java Identifier Rules!");
    }
}
