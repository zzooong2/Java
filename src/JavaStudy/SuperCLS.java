package JavaStudy;
class SuperCLS {
	protected static int count = 0; // protected는 하위 클래스 접근을 허용
	
	public SuperCLS() {
		count++;
	}
}