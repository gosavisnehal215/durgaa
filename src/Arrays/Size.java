package Arrays;
// takean array as input from the user. search for a given number x and print the index at which  it occurs.

import java.util.Scanner;

public class Size {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[]= new int[size];
        //input
       for (int i=0; i<size; i++){
           numbers[i]=sc.nextInt();
       }
       //output
        for (int i=0; i<size; i++){
            System.out.println(numbers[i]);

        }

    }
}
