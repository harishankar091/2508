package generics;

class Box<T> {
    private T value;
    public void set(T value) {
        this.value = value;
    }
    public T get() {
        return value;
    }
}
public class one {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box();
        intBox.set(100);
        System.out.println(intBox.get());
        Box<String> strBox = new Box();
        strBox.set("Hari");
        System.err.println(strBox.get());
    }
}
