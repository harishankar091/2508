package collections;
import java.util.HashMap;
public class Type6 {

    public static void main(String[] args) {
        // create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        // Add elements to the HashMap

        hashMap.put("Rohit", 45);
        hashMap.put("Hardik", 33);
        hashMap.put("Surya", 63);
        hashMap.put("Bumrah", 93);

        System.out.println("Initial HashMap: " + hashMap);

        // remove an element 
        hashMap.remove("Bumrah");

        System.out.println("HashMap after removal: " + hashMap);

        // Iterate through the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
            
        }

    }
    
}
