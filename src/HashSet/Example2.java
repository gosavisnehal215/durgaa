package HashSet;
import java.util.HashSet;
public class Example2 {
    public static void main(String[] args) {
        // Create a HashSet to store integer elements
        HashSet<Integer> numbers = new HashSet<>();

        // Add some elements to the HashSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Trying to add a duplicate element (it won't be added)
        numbers.add(20);

        // Display the HashSet
        System.out.println("HashSet of numbers: " + numbers);

        // Check if a specific number exists in the HashSet
        if (numbers.contains(30)) {
            System.out.println("The number 30 is present in the HashSet.");
        }

        // Remove a specific number from the HashSet
        numbers.remove(10);
        System.out.println("After removing 10: " + numbers);

        // Check the size of the HashSet
        System.out.println("The size of the HashSet is: " + numbers.size());

        // Check if the HashSet is empty
        if (numbers.isEmpty()) {
            System.out.println("The HashSet is empty.");
        } else {
            System.out.println("The HashSet is not empty.");
        }

        // Loop through the HashSet using a for-each loop
        System.out.println("Iterating over the HashSet:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // Clear all elements from the HashSet
        numbers.clear();
        System.out.println("After clearing, the HashSet: " + numbers);
    }
}
