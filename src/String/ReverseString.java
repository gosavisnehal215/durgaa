package String;


public class ReverseString {
    public static void main(String[] args) {
        String str = "Java";
        String reversed = "";

        // Loop through the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);  // Append each character to the result
        }

        System.out.println("Reversed String: " + reversed);
    }
}
