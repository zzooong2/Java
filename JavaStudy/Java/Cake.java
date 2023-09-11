package Java;
class Cake {
	// Object 클래스의 toString 메소드를 오버라이딩
	public String toString() {
		// Object 클래스의 toString 메소드 호출하여 반환 결과 출력
		System.out.println(super.toString());
		return "My birthday cake";
	}
}