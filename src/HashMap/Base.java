package HashMap;
import java.util.HashMap;
public class Base {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> map = new HashMap<>();

        // Add some key-value pairs
        map.put("apple", "a fruit");
        map.put("dog", "a pet animal");
        map.put("java", "a programming language");

        // Retrieve a value by its key
        System.out.println("The definition of apple is: " + map.get("apple"));

        // Check if a key exists
        if (map.containsKey("java")) {
            System.out.println("The definition of java is: " + map.get("java"));

        }
        // Remove a key-value pair
        map.remove("dog");

        // Print the HashMap after removal
        System.out.println(map);
    }
}