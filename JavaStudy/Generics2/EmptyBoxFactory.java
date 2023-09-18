package Generics2;

public class EmptyBoxFactory {
	public static <T> Box<T> makeBox() { // 제네릭 메소드
		Box<T> box = new Box<T>(); //  상자 생성
		return box; // 생성한 상자 반
	}

}
