package HashMap;

import java.util.HashMap;

public class Example {
    public static void main(String args[]){

        //creating Hashmap to store key values pairs

        HashMap<String , Integer>map= new HashMap<>();

        //Adding element to the map
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        map.put("Grapes", 4);

        // Display the map
        System.out.println("Original HashMap: " + map);

        // Retrieve a value by key
        int appleCount = map.get("Apple");
        System.out.println("Apple count: " + appleCount);

        // Check if a key exists in the map
        if (map.containsKey("Banana")) {
            System.out.println("Banana is in the map!");
        }

        // Remove an element by key
        map.remove("Orange");
        System.out.println("After removing Orange: " + map);

        // Check if the map is empty
        System.out.println("Is the map empty? " + map.isEmpty());

        // Get the size of the map
        System.out.println("Size of the map: " + map.size());

        // Loop through all key-value pairs in the map
        System.out.println("Iterating over the map:");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Clear all elements from the map
        map.clear();
        System.out.println("After clearing, the map: " + map);
    }


    }


