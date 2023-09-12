package Generics;

class FruitAndBox {
	public static void main(String[] args) {
		AppleBox aBox = new AppleBox(); // 사과 상자 생성
		OrangeBox oBox = new OrangeBox(); // 오렌지 상자 생성
		
		aBox.set(new Apple()); // 사과를 상자에 담는다
		oBox.set(new Orange()); // 오렌지를 상자에 담는다
		
		Apple ap = aBox.get(); // 상자에서 사과를 꺼낸다
		Orange or = oBox.get(); // 상자에서 오렌지를 꺼낸다
	
		System.out.println(ap);
		System.out.println(or);
	}
}
