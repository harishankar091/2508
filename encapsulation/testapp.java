package encapsulation;

public class testapp {

    // access modifiers
    public String publicname = "publicname";
    private String privatedata = "privatedata";
    protected String protecteddata = "protecteddata";
    String defaultdata = "defaultdata";

    public void display() {
        System.out.println(publicname);
        System.out.println(privatedata);
        System.out.println(protecteddata);
        System.out.println(defaultdata);
    }

}