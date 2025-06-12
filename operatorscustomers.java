public class operatorscustomers {
    public static void main(String[] args) {
        // customer details
        int customerid = 1543;
        String customername = "hari";
        double totalpurchase = 4500.0;
        int interactioncount = 5;
        // saleslead details
        int leadid = 101;
        double leadBudget = 5000.0;
        boolean iscontacted = true;
        double opportunityvalue = 6000.0;
        boolean isclosed = false;
        // use operators to compare customer and lead details
        double averagepurchasevalue = totalpurchase / interactioncount;
        boolean opportunityhighvalue = opportunityvalue > 5000.0;
        boolean isleadcontacted = iscontacted && !isclosed;
        boolean leadpriority = leadBudget > 3000.0;
        interactioncount ++; // increment interaction count
        // print results
        System.out.println("customerid is " + customerid);
        System.out.println("customername is " + customername);
        System.out.println("totalpurchase is " + totalpurchase);
        System.out.println("interactioncount is  " + interactioncount);
        System.out.println("leadid is " + leadid);
        System.out.println("leadBudget is " + leadBudget);
        System.out.println("iscontacted is " + iscontacted);
        System.out.println("opportunityvalue is " + opportunityvalue);
        System.out.println("isclosed is " + isclosed);
        System.out.println("averagepurchasevalue is  " + averagepurchasevalue);
        System.out.println("opportunityhighvalue is  " + opportunityhighvalue);
        System.out.println("isleadcontacted is " + isleadcontacted);
        System.out.println("leadpriority is " + leadpriority);
        System.out.println("interactioncount " + interactioncount);
    }
}
