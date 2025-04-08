package HashMap;

import java.util.HashMap;

public class Duplicate {
    public static void main(String[] args) {
        HashMap<Integer,String>map= new HashMap<Integer,String>();

        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"greps");
        map.put(1,"Mango");//trying to add duplicate valuse

        System.out.println(map);




    }
}
