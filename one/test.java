package one;

import java.util.Random;

public class test {


    // instance of non static variable
    int number;


    public static void main(String[] args) {

        test t1 = new test();
        t1.number = new Random().nextInt();

        test t2 = new test();
        t2.number = new Random().nextInt();

        System.out.println(t1.number);
        System.out.println(t2.number);
        
    }

}
