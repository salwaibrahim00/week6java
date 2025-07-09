package week06;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    // Fix: setBalance should actually SET the balance
    public double setBalance(double newBalance ) {
         balance+= newBalance;  // Set balance to the new value
         return balance;
    }
  

    
    // Fix: deposit should check if amount is POSITIVE
    public double deposit(double amount) {
        if (amount > 0) {  // Changed from < 0 to > 0
            balance += amount;
        }
        return balance;
    }
}