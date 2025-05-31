package CollectionPractiseProgramns.ListInterFace;


import java.util.*;

public class Arraylist4 {
    public static void main(String[] args) {
        java.util.List<Integer> nums = new java.util.ArrayList<>(List.of(5, 1, 4, 2));
        Collections.sort(nums);
        System.out.println(nums);  // [1, 2, 4, 5]
    }
}
