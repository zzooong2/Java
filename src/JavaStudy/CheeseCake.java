package JavaStudy;
class CheeseCake extends Cake {
	public void yummy() { // Cake 클래스의 yummy 메소드를 오버라이딩 함.
		super.yummy(); // Cake의 yummy 메소드 호출
		System.out.println("Yummy Cheese Cake");
	}
	public void tasty() {
		super.yummy(); // Cake의 yummy 메소드 호출
		System.out.println("Yummy Tasty Cake");
	}
}