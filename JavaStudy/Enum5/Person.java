package Enum5;

public enum Person {
	MAN(29), WOMAN(25);
	
	int age;
	private Person(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return " I am " + age + " years old!";
	}

}
