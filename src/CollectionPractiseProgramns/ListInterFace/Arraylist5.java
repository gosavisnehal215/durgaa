package CollectionPractiseProgramns.ListInterFace;
import java.util.*;
//reverse a list
public class Arraylist5 {
    public static void main(String[] args) {
        java.util.List<String> animals = new  java.util.ArrayList<>(List.of("Cat", "Dog", "Elephant"));
        Collections.reverse(animals);
        System.out.println(animals);
    }
}
