public class bankaccountoperators {
    public static void main(String[] args) {
        String accountholder = "hari";
        int accountbalance = 10000;
        double deposit = 5000;
        double withdraw = 2000;
        byte nooftransactions = 2;
        // opearators
        double updateaccountbalanceafterdepositandwithdraw = accountbalance + deposit - withdraw;
        boolean balanceisbelowminimumthreshold = updateaccountbalanceafterdepositandwithdraw < 1000;
        boolean ifdepositvaildandaccountisactive = deposit > 1000 && accountbalance > 2000;
        nooftransactions++; // increment transaction count
        // print results
        System.out.println("accountholder is " + accountholder);
        System.out.println("updateaccountbalanceafterdepositandwithdraw is " + updateaccountbalanceafterdepositandwithdraw);
        System.out.println("nooftransactions is " + nooftransactions);    
    }
}
