package HashSet;

import java.util.HashSet;
public class Example {
    public static void main(String[] args) {
        // Create a HashSet to store unique elements
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");

        // Adding a duplicate element (this will not be added)
        set.add("Apple");

        // Display the HashSet
        System.out.println("HashSet: " + set);

        // Check if an element exists in the HashSet
        if (set.contains("Banana")) {
            System.out.println("Banana is in the set!");
        }

        // Remove an element from the HashSet
        set.remove("Orange");
        System.out.println("After removing Orange: " + set);

        // Check the size of the HashSet
        System.out.println("Size of the HashSet: " + set.size());

        // Check if the HashSet is empty
        System.out.println("Is the HashSet empty? " + set.isEmpty());

        // Loop through the HashSet
        System.out.println("Iterating through the HashSet:");
        for (String item : set) {
            System.out.println(item);
        }

        // Clear all elements from the HashSet
        set.clear();
        System.out.println("After clearing, the HashSet: " + set);
    }

}
