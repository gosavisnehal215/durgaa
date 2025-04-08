package Linked_Lisr;
import java.util.LinkedList;
public class Pratice {

        public static void main(String[] args) {
            // Creating a LinkedList of integers
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Adding elements
            linkedList.add(10);
            linkedList.add(20);
            linkedList.add(30);
            linkedList.addFirst(5);  // Adding at the beginning
            linkedList.addLast(40);  // Adding at the end

            // Printing elements
            System.out.println("LinkedList Elements: " + linkedList);

            // Remove the first and last elements
            linkedList.removeFirst();
            linkedList.removeLast();

            System.out.println("After removing first and last elements: " + linkedList);
        }
    }


