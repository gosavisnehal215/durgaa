package Identifier;

//1)What is the difference between keywords, identifiers and literals in java ?

public class Difference {

    int myNumber = 10;       // ✅ "myNumber" (Identifier: Variable Name),  🔹 10 (Literal: Integer)
    double pi = 3.14;        // ✅ "pi" (Identifier: Variable Name), 🔹 3.14 (Literal: Floating-point)
    String message = "Hello Java";  // ✅ "message" (Identifier), 🔹 "Hello Java" (Literal: String)
    boolean isJavaFun = true;  // ✅ "isJavaFun" (Identifier), 🔹 true (Literal: Boolean)

    public static void main(String[] args) {  // ✅ "main", "args" (Identifiers), 🚀 "public", "static", "void" (Keywords)
        Difference obj = new Difference();  // ✅ "obj" (Identifier: Object Reference)
        obj.display();  // ✅ "display" (Identifier: Method Name)
    }

    void display() {  // ✅ "display" (Identifier: Method Name)
        System.out.println("Literals in Java!");  // 🔹 "Literals in Java!" (Literal: String)
    }
}
