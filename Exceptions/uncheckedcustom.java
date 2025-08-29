package Exceptions;
// Custom Runtime Exception
class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class uncheckedcustom {
    private double balance = 5000;

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining: " + balance);
        }
    }

    public static void main(String[] args) {
        uncheckedcustom account = new uncheckedcustom();
        account.withdraw(1000);
    }

    
}

