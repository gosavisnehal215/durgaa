package String;

public class ReverseString2 {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();  // Reversing the string
        System.out.println("Reversed String: " + sb.toString());
    }
}
