package Generics2;

public class Unboxer {
	public static <T> T opneBox(Box<T> box) {
		return box.get();
	}
	
	// 상자 안의 내용물을 확인하는(출력하는) 기능의 제네릭 메소드
	public static <T> void peekBox(Box<T> box) {
		System.out.println(box);
	}

}
