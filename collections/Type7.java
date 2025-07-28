package collections;

import java.util.*;
public class Type7 {

    public static void main(String[] args) {
        
        // create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add elements to the TreeMap
        treeMap.put("Dhoni", 7);
       treeMap.put("Kohli", 18);
        treeMap.put("Rohit", 45);

        System.out.println("Intial TreeMap: " + treeMap);

        // remove an element
        treeMap.put("Kohli", 18);
         System.out.println("TreeMap after removal: " + treeMap);

         // Iterate through the TreeMap
         for(Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
         }


        
    }
    
}
