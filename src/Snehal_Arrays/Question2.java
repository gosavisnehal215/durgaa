//Problem: Find the sum of all elements
//Task: Find the total sum of all numbers in an array
//Concept: Accumlating values in a loop

package Snehal_Arrays;

public class Question2 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
    }

}
