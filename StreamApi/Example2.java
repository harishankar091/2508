package StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);

        // using lamba expression to print even numbers
        Collections.sort(numbers, (a, b) -> a - b);

        numbers.forEach(n -> System.out.println(n));
    }
    
}
