package PR;
// Check if a String Contains a Substring
public class Five {
    public static void main(String[] args) {
        String str = "Java programming";
        String sub = "mmi";

        if (str.contains(sub)) {
            System.out.println("Substring found.");
        } else {
            System.out.println("Substring not found.");
        }
    }
}
