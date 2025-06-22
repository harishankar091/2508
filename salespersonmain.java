public class salespersonmain {
    public static void main(String[] args) {
        salespersoninfo sp = new salespersoninfo();
        sp.inputSalespersonDetails();
        sp.setDealsClosed();
        sp.calculateEarnings();
        sp.displayEarningsReport();
    }
}

