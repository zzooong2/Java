package Generics2;

public class WildcardUnboxer {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("So Simple String");
		Unboxer.peekBox(box); // 상자 안의 내용물을 확인해본다.
	}

}
