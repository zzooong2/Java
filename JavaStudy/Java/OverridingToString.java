package Java;
class OverridingToString {
	public static void main(String[] args) {
		Cake c1 = new Cake();
		Cake c2 = new CheeseCake();
		
		// c1이 참조하는 인스턴스의 toString 메소드 호출로 이어짐
		System.out.println(c1);
		System.out.println();
		
		// c2이 참조하는 인스턴스의 toString 메소드 호출로 이어짐
		System.out.println(c2);
	}
}