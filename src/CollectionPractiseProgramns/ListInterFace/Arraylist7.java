package CollectionPractiseProgramns.ListInterFace;
import java.util.*;
//Remove All Duplicates from a List

    public class Arraylist7 {
        public static void main(String[] args) {

            java.util.List<String> names = new java.util.ArrayList<>(List.of("krish", "meena", "vena", "krish", "vena"));
            Set<String> uniqueNames = new LinkedHashSet<>(names);
            System.out.println(new java.util.ArrayList<>(uniqueNames));
        }
    }


