package CollectionPractiseProgramns.ListInterFace;
import java.util.*;
//Convert Array to List
public class Arraylist6 {
    public static void main(String[] args) {
        String[] cities = {"Delhi", "Mumbai", "Chennai"};
        java.util.List<String> cityList = new java.util.ArrayList<>(Arrays.asList(cities));
        System.out.println(cityList);
    }
}
