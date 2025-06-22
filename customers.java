import java.util.Scanner;
public class customers {
    // customer data
    int customerID;
    String customerName;
    int loyalpoints;
    int totaldealvalue;

    // print customer details
    public void customerdetails() {
        System.out.println("==========customer details==========");
        System.out.println("customer ID: " +customerID);
        System.out.println("customer Name: " +customerName);

        // take inputs
        Scanner sc = new Scanner (System.in);

        // track interaction
        int trackinteraction;
        System.out.println("Enter the number of interaction:");
        trackinteraction = sc.nextInt();


        // calculate loyal points
        loyalpoints += trackinteraction * 2; // 2 points per interaction

        // deal value handling
        int dealvalue;
        System.out.println("Enter the deal value: " );
        dealvalue = sc.nextInt();
        totaldealvalue += dealvalue;
        if (totaldealvalue >= 50000) {
            loyalpoints += 10;
        } else if (totaldealvalue >= 20000) {
            loyalpoints += 5;
        } else  {
            loyalpoints += 0;
        }
        // loyalty status
        if (loyalpoints >= 20) {
            System.out.println("Platinum");
        }else if (loyalpoints >= 15) {
            System.out.println("Gold");
        }else if (loyalpoints >= 10) {
            System.out.println("Silver");
        }else {
            System.out.println("Needs more engagement");
        }


        
    }
}

