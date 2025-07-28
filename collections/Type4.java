package collections;

import java.util.LinkedHashSet;

public class Type4 {

    public static void main(String[] args) {
        
        // Create a Linked HashSet
        LinkedHashSet<String> linkedset = new LinkedHashSet<>();

        // Add elements to the linked HashSet
        linkedset.add("Hari");
        linkedset.add("");
        linkedset.add("Kiran");
        linkedset.add("Harsha");
        linkedset.add("Abhi");
        linkedset.add("Vijay");

        System.out.println("Initial LinkedHashSet: " + linkedset);

        for (String name: linkedset) {
            System.out.println(name);
        }
    }
    
}
