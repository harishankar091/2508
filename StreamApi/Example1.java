package StreamApi;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hari", "Ravi", "Anu", "Hari", "Kiran");

        // Filter names starting with 'H' and print them
        List<String> result = names.stream()
                .filter(name -> name.startsWith("R"))
                .distinct()
                .collect(Collectors.toList());

                System.out.println(result);

    }
    
}
