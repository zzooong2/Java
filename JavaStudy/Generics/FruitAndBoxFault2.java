package Generics;

class FruitAndBoxFault2 {
	public static void main(String[] args) {
		Box aBox = new Box(); // 상자 생성
		Box oBox = new Box(); // 상자 생성
		
		// 프래그래머의 실수. 인자를 담아야하는데 문자열을 담음.
		aBox.set("Apple");
		oBox.set("Orange");
		
		System.out.println(aBox.get());
		System.out.println(oBox.get());
	}
}
