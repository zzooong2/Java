package Generics2;

public class SteelBox<T> extends Box<T> {
	public SteelBox(T o) { // 제네릭 클래스의 생성자
		ob = o;
	}
}
