package StreamApi;

import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Double each number and print them
        numbers.stream()
                .map(n -> n * 2)
                .forEach(n -> System.out.println(n));
    }
    
}
