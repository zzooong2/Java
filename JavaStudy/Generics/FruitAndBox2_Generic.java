package Generics;

class FruitAndBox2_Generic {
	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>(); // T를 사과로 설정
		Box<Orange> oBox = new Box<Orange>(); // T를 오렌지로 설정
		
		aBox.set(new Apple()); // 사과를 상자에 담는다
		oBox.set(new Orange()); // 오렌지를 상자에 담는다
		
		Apple ap = aBox.get(); // 상자에서 사과를 꺼낸다. 형변환 없이
		Orange or = oBox.get(); // 상자에서 오렌지를 꺼낸다. 형변환 없이
	
		System.out.println(ap);
		System.out.println(or);
	}
}
