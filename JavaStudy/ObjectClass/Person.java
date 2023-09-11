package ObjectClass;

class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	protected void finalize() throws Throwable {
		super.finalize(); // 상위 클래스의 finalize 메소드 호출
		System.out.println("destroyed : " + name);
	}
}