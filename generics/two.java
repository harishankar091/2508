package generics;

class Calculator<T extends Number> {
    private T num1;
    private T num2;
    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

public double add() {
    return num1.doubleValue() + num2.doubleValue();
}
}
public class two {
    public static void main(String[] args) {
        Calculator<Integer> c1 = new Calculator<>(10, 20);
        Calculator<Double> c2 = new Calculator<>(10.5, 20.5);
        System.out.println("Sum of Integers: " + c1.add());
        System.out.println("Sum of Doubles: " + c2.add());
}
}