package JavaStudy;
class BankAccount {
	int balance = 0; // 예금 잔액
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
}	
	
class PassingRef {
	public static void main(String[] args) {
		BankAccount ref = new BankAccount();
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref); // '참조 값'의 전달
	}
	
	public static void check(BankAccount acc) {
		acc.checkMyBalance();
	}
}