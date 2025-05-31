package CollectionPractiseProgramns.ListInterFace;

import java.util.*;
//Rotate a List by N Positions anticlockwise

public class Ex10 {
    public static void main(String[] args) {
        java.util.List<Integer> nums = new java.util.ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int n = 5;  //


        Collections.rotate(nums, n);
        System.out.println("Rotated list: " + nums);
    }
}
