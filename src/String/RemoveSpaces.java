package String;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string: ");
        String input = scanner.nextLine();

        String output= input.replaceAll("\\s","");
        System.out.println("String without spaces: "+ output);

    }
}
