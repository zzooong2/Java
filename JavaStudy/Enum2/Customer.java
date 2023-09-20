package Enum2;

public class Customer { 
	enum Gender { //클래스 내에 정의 된 열거형 Gender
		MALE, FEMALE
	}
	private String name;
	private Gender gen;
	
	Customer(String n, String g){
		name = n;
		
		if(g.equals("man"))
			gen = Gender.MALE;
		else
			gen = Gender.FEMALE;
	}
	
	@Override
	public String toString() {
		if(gen == Gender.MALE)
			return "Thank you, MR" + name;
		else
			return "Thank you, Mrs" + name;
	}

}
