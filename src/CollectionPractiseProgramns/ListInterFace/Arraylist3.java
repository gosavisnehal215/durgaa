package CollectionPractiseProgramns.ListInterFace;

import java.util.*;

public class Arraylist3 {
    public static void main(String[] args) {
       java.util.List<String> names = new java.util.ArrayList<>(List.of("Divya", "Jyoti", "Deepak"));
        names.remove("Jyoti");
        System.out.println(names);
    }
}
