package String;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = sc.nextLine().toLowerCase();

        int vowels=0,consonants= 0;

        for (int i =0 ; i<input.length(); i++){
            char c= input.charAt(i);
            if(Character.isLetter(c)){
                if("aeiou".indexOf(c) !=-1)
                {
                vowels++;}
            }else{
                consonants++;
            }
        }

        System.out.println("Vowels: "+ vowels);
        System.out.println("consonants:"+ consonants);

    }
}

