package CollectionPractiseProgramns.ListInterFace;

import java.util.*;

public class Arraylist9 {
    public static void main(String[] args) {
        java.util.List<String> list1 = new java.util.ArrayList<>(List.of("One", "Two"));

        java.util.List<String> list2 =  new java.util.ArrayList<>(List.of("Three", "Four"));
        list1.addAll(list2);
        System.out.println("Merged List: " + list1);
    }
}
