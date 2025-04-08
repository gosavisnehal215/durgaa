package HashSet;
import java.util.HashSet;
public class Pratice {
    public static void main(String[] args) {
            // Creating a HashSet of strings
            HashSet<String> set = new HashSet<>();

            // Adding elements
            set.add("Mango");
            set.add("Banana");
            set.add("MAngo");  // Duplicate, will not be added
            set.add("Orange");

            // Printing elements (order is not guaranteed)
            System.out.println("HashSet Elements: " + set);
        }
    }


