public class iventorysystemCRM {
    public static void main(String[] args) {
        String productname = "iphone 16";
        int productquatity = 10;
        double unitprice = 9999.99;
        boolean reorderthreshold = true;
        // calcualtion using operators
        double totalvalueinstock = productquatity * unitprice;
        boolean productquatityisbelowreorderthreshold = productquatity > 6;
        boolean issufficientandproductismarkedforsale = productquatity > 6 || reorderthreshold;
        productquatity--; // decrement product quatity after sale
        //print results
        System.out.println("productname is " + productname);
        System.out.println("totalvalueinstock is " + totalvalueinstock);
        System.out.println("productquatityisbelowreorderthreshold is " + productquatityisbelowreorderthreshold);
        System.out.println("issufficientandproductismarkedforsale is " + issufficientandproductismarkedforsale);
        System.out.println("productquatity is " + productquatity);
    }
}
