package JavaStudy;
class NumberPrinter {
	private int myNum = 0;
	
	static void showInt(int n) { // 클래스 메소드(static 메소드)
		System.out.println(n);
	}
	static void showDouble(double n) { // 클래스 메소드
	    System.out.println(n);
    }
	
	void setMyNumber(int n) { // 인스턴스 메소드
		myNum = n;
	}
	void showMyNumber() { // 인스턴스 메소드
		showInt(myNum); // 클래스 내부에서 클래스 메소드 호출
	}
}