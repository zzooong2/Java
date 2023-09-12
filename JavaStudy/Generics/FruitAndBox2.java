package Generics;

class FruitAndBox2 {
	public static void main(String[] args) {
		Box aBox = new Box(); // 상자 생성
		Box oBox = new Box(); // 상자 생성
		
		aBox.set(new Apple()); // 사과를 상자에 담는다
		oBox.set(new Orange()); // 오렌지를 상자에 담는다
		
		Apple ap = (Apple)aBox.get(); // 상자에서 사과를 꺼낸다
		Orange or = (Orange)oBox.get(); // 상자에서 오렌지를 꺼낸다
	
		System.out.println(ap);
		System.out.println(or);
	}
}
