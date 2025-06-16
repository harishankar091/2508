import java.util.Scanner;
public class Customersdata {
    public static void main(String[] args) {
        //inputs 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer ID: ");
        int customerID = scanner.nextInt();
        System.out.println("Enter Customer Name:");
        String customerName = scanner.next();
        System.out.println("Enter Customer Age:");
        double customerage = scanner.nextDouble();
        
        double totalpurchase = 0;
        int noofpurchases = 0;
        // stpore input given from customer
        String continueInput = "yes";
        while (continueInput == "yes") {
            System.out.println("Enter purchase amount for product " + (noofpurchases + 1));
            double currentPurchase = scanner.nextDouble();
            noofpurchases++;
            totalpurchase += currentPurchase;
            System.out.println("Do you want to enter another purchase amount? (yes/no)");
            scanner.next();
            continueInput =scanner.nextLine();

            double avgPurchase = totalpurchase / noofpurchases;
            String performance;
            if (avgPurchase >= 10000) {
                performance = "Excellent";
            }else if (avgPurchase >= 5000) {
                performance = "Good";
            }else if (avgPurchase >= 2000) {
                performance = "Average";
            }else if (avgPurchase >= 1000) {
                performance = "Poor";
            }else {
                performance = "Needs Improvement";
            }
            // output the results 
            System.out.println("customer ID: " + customerID);
            System.out.println("customer Name: " + customerName);
            System.out.println("Total Purchase Amount: " + totalpurchase);
            System.out.println("Average Purchase Amount: " + avgPurchase);
            System.out.println("Customer Performance: " + performance);
            // close the scanner
            scanner.close();
            }


    }
}