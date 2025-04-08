package ArrayList;
import java.util.ArrayList;
public class ArrayPro {
    public static void main(String[] args) {
            // Creating an ArrayList of integers
            ArrayList<Integer> numbers = new ArrayList<>();

            // Adding elements
            numbers.add(57);
            numbers.add(65);
            numbers.add(32);
            numbers.add(40);

            // Printing elements
            System.out.println("ArrayList Elements: ");
            for (Integer number : numbers) {
                System.out.println(number);
            }

            // Get an element
            System.out.println("Element at index 2: " + numbers.get(2));

            // Remove an element
            numbers.remove(Integer.valueOf(20));
            System.out.println("After removing 20: " + numbers);
        }
    }


