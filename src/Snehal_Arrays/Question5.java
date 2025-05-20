//Problem: Find the Maximum Element in the array
//Task: Print the largest number from an array

package Snehal_Arrays;

public class Question5 {
    public static void main(String[] args) {
        int[] arr = {12, 5, 22, 18, 7};
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Element in the Array is: " + max);
    }
}
