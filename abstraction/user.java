package abstraction;

public class user {
    public static void main(String[] args) {
        newmobile iqoo = new iqoo();
        iqoo.charger();
        iqoo.call();
        iqoo.message();
        

       newmobile redmi = new redmi();
        redmi.charger();
        redmi.call();
        redmi.message();
        ((redmi) redmi).voicemail();

    }
    
}
