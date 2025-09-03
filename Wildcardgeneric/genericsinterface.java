package Wildcardgeneric;

interface Container<T> {
    void add(T item);
    T get();
}
class Store<T> implements Container<T> {
    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}

public class genericsinterface {
    public static void main(String[] args) {
        Store<String> store = new Store<>();
        store.add("Hari");
        System.out.println(store.get());
    }
}
