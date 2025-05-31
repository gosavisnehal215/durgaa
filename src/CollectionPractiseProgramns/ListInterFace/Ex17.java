package CollectionPractiseProgramns.ListInterFace;
import java.util.*;
//Reverse Key and Value in a Map
public class Ex17 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("IN", "India");
        map.put("US", "United States");

        Map<String, String> reversed = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            reversed.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Reversed Map: " + reversed);
    }
}
