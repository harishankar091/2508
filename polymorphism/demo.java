package polymorphism;

public class demo {
    
    // many forms/variations
    // 1st variation
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    // 2nd variation
     public void add(double a, double b) {
        System.out.println("Sum: " + (a + b));
    }
    // 3rd variation
    public void add(double a, double b, int x) {
        System.out.println("Sum: " + (a + b + x));
    }
    // 4th variation
    public void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }
    public static void main(String[] args) {
        demo d = new demo();
        d.add(10, 20); // calls the first variation
        d.add(20, 30); // calls the second variation
        d.add(10, 20, 30); // calls the third variation
        d.add(30, 40, 50); // calls the fourth variation
    }
    
}
