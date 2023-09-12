package Generics;

class FruitAndBoxFault_Generic {
	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>(); // T를 사과로 설정
		Box<Orange> oBox = new Box<Orange>(); // T를 오렌지로 설정
		
		aBox.set("Apple");
		oBox.set("Orange");
		
		
		Apple ap = (Apple)aBox.get();
		Orange or = (Orange)oBox.get();
	
		System.out.println(ap);
		System.out.println(or);
	}
}
