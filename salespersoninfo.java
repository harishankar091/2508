import java.util.Scanner;

public class salespersoninfo {
    int salespersonId;
    String salespersonName;
    int dealsClosed;
    double totalEarnings;
    double bonus;

    Scanner scanner = new Scanner(System.in);

    // Step 1: Input Salesperson Identity
    public void inputSalespersonDetails() {
        System.out.print("Enter Salesperson ID: ");
        salespersonId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Salesperson Name: ");
        salespersonName = scanner.nextLine();
    }

    // Step 2: Set number of deals closed
    public void setDealsClosed() {
        System.out.print("Enter number of deals closed: ");
        dealsClosed = scanner.nextInt();
    }

    // Step 3: Calculate Earnings
    public void calculateEarnings() {
        double basePayment = dealsClosed * 2500;

        System.out.print("Enter customer rating (1 to 5): ");
        int rating = scanner.nextInt();

        if (rating >= 4) {
            bonus = 2000;
        } else {
            bonus = 0;
        }

        totalEarnings = basePayment + bonus;
    }

    // Step 4: Display Report
    public void displayEarningsReport() {
        System.out.println("\n--- Salesperson Earnings Report ---");
        System.out.println("Salesperson ID: " + salespersonId);
        System.out.println("Name: " + salespersonName);
        System.out.println("Deals Closed: " + dealsClosed);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Earnings: ₹" + totalEarnings);
    }
}