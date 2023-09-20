package Enum4;

public enum Person {
	MAN, WOMAN;
	
	private Person() {
		System.out.println("Person constructor called");
	}
	
	@Override
	public String toString() { return "I love 백재롱 so much..!"; }

}
