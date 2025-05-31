package ArrayList;

import java.util.ArrayList;

public class For_Loop_Ex2 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Krushan");
        names.add("Mahi");
        names.add("Deven");

     //   System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }

}}

