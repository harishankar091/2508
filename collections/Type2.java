package collections;

import java.util.LinkedList;

public class Type2 {
    public static void main(String[] args) {
        // Create a collection
        LinkedList<String> collection = new LinkedList<>();

        // Add elements to the collection
        collection.add("Java");
        collection.add("python");
        collection.add("C++");
        collection.add("JavaScript");

        // remove an element
        collection.remove("C++");

        System.out.println("Collection after removals: " + collection);

        // Iterate through the collection
        for (String lang : collection) {
            System.out.println(lang);
        }
    }

}
