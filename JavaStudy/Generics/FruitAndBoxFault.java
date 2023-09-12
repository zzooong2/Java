package Generics;

class FruitAndBoxFault {
	public static void main(String[] args) {
		Box aBox = new Box(); // 상자 생성
		Box oBox = new Box(); // 상자 생성
		
		// 사과, 오렌지 라는 인자를 넣은게 아니라 문자열을 넣었다.
		aBox.set("Apple");
		oBox.set("Orange");
		
		// 상자에 문자열을 담았는데 인자를 꺼내려한다.
		Apple ap = (Apple)aBox.get();
		Orange or = (Orange)oBox.get();
	
		System.out.println(ap);
		System.out.println(or);
	}
}
