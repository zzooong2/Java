package ClassInstance;

public class BankAccountPO {
	static int balance = 0; 
	
	public static void main(String[] args) {
		deposit(1000000000);
		checkMyBalance();
		withdraw(5000);
		checkMyBalance();
		
		
	}
	
	
	public static int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public static int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public static int checkMyBalance() {
		System.out.println("통장 잔액: " + balance);
		return balance;
	}

}
