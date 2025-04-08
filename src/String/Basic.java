package String;

public class Basic {
    public static void main(String[] args) {
        // Create a String object
        String greeting = "Hello, Java!"; //without using new keyword

        // Print the string
        System.out.println(greeting);

        // Get the length of the string
        int length = greeting.length();
        System.out.println("Length of the string: " + length);

        // Extract a substring from the string (substring from index 7 to 11)
        String substring = greeting.substring(7, 11);
        System.out.println("Substring (index 7 to 11): " + substring);

        // Convert the string to uppercase
        String upperCaseGreeting = greeting.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseGreeting);

        // Check if two strings are equal
        String anotherGreeting = "Hello, Java!";
        boolean isEqual = greeting.equals(anotherGreeting);
        System.out.println("Are the strings equal? " + isEqual);

        // Concatenate two strings
        String fullGreeting = greeting + " Welcome to the world of Java."; //in this we combines two sentence in one line
        System.out.println("Concatenated String: " + fullGreeting);

        // Replace a word in the string
        String modifiedGreeting = greeting.replace("Java", "World");
        System.out.println("Modified String: " + modifiedGreeting);
    }
}
