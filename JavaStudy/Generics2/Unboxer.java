package Generics2;

public class Unboxer {
		public static void peekBox(Box<? super Integer> box) { // 와일드카드 사
		System.out.println(box);
	}

}
