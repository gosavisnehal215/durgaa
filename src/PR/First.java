package PR;

public class First {
    public static void main(String[] args) {

        String greeting = "Hello, Java!";

        System.out.println(greeting);


        int length = greeting.length();// Get the length
        System.out.println("Length of the string: " + length);

        // Extract a substring from the string (substring from index 7 to 11)
        String substring = greeting.substring(7, 11);
        System.out.println("Substring (index 7 to 11): " + substring);


        String upperCaseGreeting = greeting.toUpperCase();// Convert the string to uppercase
        System.out.println("Uppercase String: " + upperCaseGreeting);


        // Concatenate two strings
        String fullGreeting = greeting + " Welcome to the world of Java."; //in this we combines two sentence in one line
        System.out.println("Concatenated String: " + fullGreeting);

    }
}