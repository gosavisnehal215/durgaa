package CollectionPractiseProgramns.ListInterFace;

import java.util.*;

public class Arraylist8 {
    public static void main(String[] args) {
        java.util.List<String> original = new java.util.ArrayList<>(List.of("A", "B", "C"));
        List<String> copy = new java.util.ArrayList<>(original);
        System.out.println(copy);
    }
}
