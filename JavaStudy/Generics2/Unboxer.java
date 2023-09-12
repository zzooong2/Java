package Generics2;

public class Unboxer {
	public static void peekBox(Box<? super Number> box) {
		System.out.println(box);
	}
}
