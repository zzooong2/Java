package Generics2;

public class WildcardUnboxer2 {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("so simple string");
		Unboxer.peekBox(box); // 상자 안 내용물을 확인한다.
	}

}
