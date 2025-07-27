package collections;

import java.util.*;
public class Arraylist {

    public static void main(String[] args) {
        // Create an ArrayList 
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Intial ArrayList:" + list);

        for (String lang: list) {
            System.out.println(lang);
        }

    }

}
