package CollectionPractiseProgramns.ListInterFace;
import java.util.*;
//update a valuse in map
public class HaspMap5 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Item1", 100);
        map.put("Item2", 200);


        map.put("Item1", 150);

        System.out.println(map);
    }
}
