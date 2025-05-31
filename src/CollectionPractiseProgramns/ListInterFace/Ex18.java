package CollectionPractiseProgramns.ListInterFace;
import java.util.*;
//Phone Book Using Map
public class Ex18 {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Ravi", "1234567890");
        phoneBook.put("Shiv", "9876543210");

        System.out.println("Ravi Number: " + phoneBook.get("Ravi"));
        System.out.println("All Contacts: " + phoneBook);
    }

}
