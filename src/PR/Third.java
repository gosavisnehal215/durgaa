package PR;
//reverse string
public class Third {
    public static void main(String[] args) {
        String str = "Deven";

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();  // Reversing the string

        System.out.println("Reversed String: " + sb.toString());
    }
}