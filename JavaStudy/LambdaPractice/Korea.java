package LambdaPractice;

public class Korea {
	public static String country = "대한민국";
	
	public static void showString(Football f, String s) {
		f.print(s);
	}
	
	public static void main(String[] args) {
	     showString((s) -> { System.out.println(country + s); }, " 항저우 올림픽 축구 금메달!! 진짜 땄음 ㅋㅋ");
	}

}
