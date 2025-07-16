package polymorphism;

public class main {
    public static void main(String[] args) {
        // create objects of different mobile types
        mobile iqoo = new iqoo();
        mobile redmi = new redmi();

        // call the ring method on each object
        iqoo.ring(); // calls the override method in iqoo
        redmi.ring(); // calls the override method in redmi
        
    }

}
