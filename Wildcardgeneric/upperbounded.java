package Wildcardgeneric;

import java.util.List;

public class upperbounded {
    public static double sumofList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
}