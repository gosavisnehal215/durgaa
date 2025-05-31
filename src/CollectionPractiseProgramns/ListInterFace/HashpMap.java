package CollectionPractiseProgramns.ListInterFace;
import java.util.*;
public class HashpMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Name", "krushna");
        map.put("City", "karjat");

        String name = map.get("Name");
        String City = map.get("City");
        System.out.println("Name: " + name);
        System.out.println("City: " + City);
    }
}
