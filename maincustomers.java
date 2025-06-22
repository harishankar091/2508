public class maincustomers {
    public static void main(String[] args) {
        // customer data
        customers c1 = new customers();
        c1.customerID = 569;
        c1.customerName = "prabhas";

        c1.customerdetails();
        System.out.println("c1.trackinteraction: " +c1.loyalpoints);
        System.out.println("c1.totaldealvalue: " +c1.totaldealvalue);
        System.out.println("c1.loyalpoints: " +c1.loyalpoints);
    }
    
}
