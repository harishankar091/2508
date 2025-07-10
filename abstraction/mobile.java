package abstraction;

public interface mobile {

    public void charger();

    public void call();

    public void message();

    default void snapdragon(){
        System.out.println("snapdragon processor");
    }
    static void dualspeaker() {
        System.out.println("feature is dual speaker");
    }

}
