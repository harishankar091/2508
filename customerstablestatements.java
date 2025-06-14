public class customerstablestatements {
    public static void main(String[] args) {
        // varaibles for customer table
        int customerId = 625;
        String customerName = "hari";
        boolean isPremium = true;
        int yearsofpartnership = 4;
        String dealstage = "negotiation";
        double dealvalue = 100000.00;
        // conditional statements for customer table
        double baseDiscount = 0;
        if (isPremium) {
            baseDiscount = 10.0;
        }else if (yearsofpartnership >= 3) {
            baseDiscount = 0.5;
        }else {
            baseDiscount = 0;
        }
        // extra discount based on deal stage
        double extraDiscount = 0;
        switch (dealstage) {
            case "negotiation":
            extraDiscount += 0.03;
            break;
            case "proposal":
            extraDiscount += 0.02;
            break;
            case "closed":
            extraDiscount += 0.05;
            break;
        }
        // calculate the total discount and discounted deal value
        double totalDiscount = baseDiscount + extraDiscount;
        double discountedDealValue = dealvalue - (dealvalue * totalDiscount/100);
        //print the results
        System.out.println("customerId is " + customerId);
        System.out.println("customerName is " + customerName);
        System.out.println("isPremium is " + isPremium);
        System.out.println("yearsofpartnership is " + yearsofpartnership);
        System.out.println("dealstage is " + dealstage);
        System.out.println("dealvalue is " + dealvalue);
        System.out.println("baseDiscount is " + baseDiscount);
        System.out.println("extraDiscount is " + extraDiscount);
        System.out.println("totalDiscount is " + totalDiscount);
        System.out.println("discountedDealValue is " + discountedDealValue);
        }
    }   
