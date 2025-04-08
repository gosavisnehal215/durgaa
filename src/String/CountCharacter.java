package String;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Enter the character to count: ");
        char character = scanner.next().charAt(0);

        int count = 0;

        for (char c : input.toCharArray()) {
            if (c == character) {
                count++;
            }
        }
    }}
