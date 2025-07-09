package week06;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BankAccount myaccount = new BankAccount(1000.0);
    	System.out.println("my account " + myaccount.getBalance());
    	
    	System.out.println("set my account to" + myaccount.setBalance(15000.00));
    	
    	
    	System.out.println("my account balance is now"+ myaccount.deposit(200));
    }
}
	