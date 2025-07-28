package collections;

import java.util.HashSet;

public class Type3 {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Yellow");

        System.out.println("Initial HashSet: " + set);

        // Remove an element
        set.remove("Green");

        System.out.println("HashSet after removal: " + set);

        // Iterate through the HashSet
        for (String color : set) {
            System.out.println(color);
        }
    }

}
