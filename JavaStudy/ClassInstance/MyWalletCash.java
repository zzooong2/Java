package ClassInstance;

public class MyWalletCash {
	static int cash = 0;
	
	public static void main(String[] args) {
		allowance(10000);
		checkMyWallet();
		pay(1000);
		checkMyWallet();
	}
	
	
	public static int allowance(int money) {
		cash += money;
		return cash;
	}
	
	public static int pay(int money) {
		cash -= money;
		System.out.println("돈 사용했으니까.... 이제");
		return cash;
	}
	
	public static int checkMyWallet() {
		System.out.println("지갑에 얼마있냐면..." + cash + "원");
		return cash;
	}

}
