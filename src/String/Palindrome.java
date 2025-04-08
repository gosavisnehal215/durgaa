package String;
//A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Check if original string is equal to the reversed string
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}


