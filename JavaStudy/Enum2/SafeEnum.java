package Enum2;

public class SafeEnum {
	public static void main(String[] args) {
		who(Person.MAN); // 정상적인 메소드 호출
		cute(Animal.DOG); // 비정상적 메소드 호출
	}
	public static void who(Person man) {
		switch(man) {
		case MAN:
			System.out.println("남성 손님입니다.");
			break;
		case WOMAN:
			System.out.println("여성 손님입니다.");
			break;
		}
	}
	public static void cute(Animal dog) {
		switch(dog) {
		case DOG:
			System.out.println("강아지 입니다.");
			break;
		case CAT:
			System.out.println("고양이 입니다.");
			break;	
	    }
	}
}
