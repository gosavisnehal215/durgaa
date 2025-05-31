package CollectionPractiseProgramns.ListInterFace;
import java.util.*;
//Remove an Element by Key



    public class HaspMap3 {
        public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>();

            map.put("Math", 90);
            map.put("Science", 85);
            map.remove("Math");

            System.out.println(map);
        }
    }


