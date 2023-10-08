package LambdaPractice;

public class France {
	public static String country = "프랑스";
	
	public static void showString(Football f, String s) {
		f.print(s);
	}

	public static void main(String[] args) {
		showString((s) -> { System.out.println(country + s); },"의 아트사커 다 어디감??");
		
	}

}
