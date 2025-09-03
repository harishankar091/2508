package Wildcardgeneric;

import java.util.List;

public class unbounded {
    public static void printList(List<?> list) {
    for (Object obj : list) {
        System.out.println(obj + "");
    }
}
}