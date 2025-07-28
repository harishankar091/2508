package collections;

import java.util.TreeSet;
public class Type5 {

    public static void main(String[] args) {
        
        // create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("cricket");
        treeSet.add("volleyball");
        treeSet.add("football");
        treeSet.add("basketball");
        treeSet.add("tennis");

        System.out.println("Initial TreeSet: " + treeSet);

        // remove an element
        treeSet.remove("football");

        System.out.println("TreeSet after removal: " + treeSet);

        // Interate through the TreeSet
        for(String Sports : treeSet) {
            System.out.println(Sports);
        }
    }
    
}
