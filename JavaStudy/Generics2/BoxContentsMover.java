package Generics2;

public class BoxContentsMover {
	// from에 저장된 내용물을 to로 이동
	public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from) {
		to.set(from.get());
		}
}
