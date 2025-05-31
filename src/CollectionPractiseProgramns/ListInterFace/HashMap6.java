package CollectionPractiseProgramns.ListInterFace;
import java.util.*;
//Sort a Map by Keys (Using TreeMap)
public class HashMap6 {
    public static void main(String[] args) {
        Map<String, Integer> unsorted = new HashMap<>();
        unsorted.put("Zebra", 5);
        unsorted.put("Apple", 3);
        unsorted.put("Mango", 8);

        Map<String, Integer> sorted = new TreeMap<>(unsorted);
        System.out.println("Sorted by Alphabet: " + sorted);
    }
}
