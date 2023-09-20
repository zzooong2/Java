package Lambda;

public class Lambda2 {
	public static void main(String[] args) {
		Printable prn = new Printable() { // 익명 클래스
			public void print(String s) {
				System.out.println(s);
			}
		};
		
		prn.print("What is Lambda??");
	}

}
