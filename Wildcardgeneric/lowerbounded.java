package Wildcardgeneric;

import java.util.List;

public class lowerbounded {
    public static void addIntegers(List<? super Integer> list) {
        list.add(50);
    }
    
}
