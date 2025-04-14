package HashMap;

import java.util.HashMap;

public class Pra {
    public static void main(String[] args) {
        HashMap< Integer, String> listoffruit = new HashMap<>();

        listoffruit.put(1,"mango");
        listoffruit.put(2,"banana");
        listoffruit.put(1,"apple");

        System.out.println(listoffruit);
    }
}
