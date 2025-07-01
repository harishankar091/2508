public class salespersonmain {
    public static void main(String[] args) {
        Salesperson sp = new Salesperson();
        sp.inputSalespersonDetails();
        sp.setDealsClosed();
        sp.calculateEarnings();
        sp.displayEarningsReport();
    }
}

