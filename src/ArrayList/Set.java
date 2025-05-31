package ArrayList;

import java.util.ArrayList;
//Replace an element
public class Set {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Delhi");//initial index state 0
        cities.add("Mumbai");//////initial index state 1

        cities.set(1, "Bangalore");

        System.out.println(cities);

    }

}


