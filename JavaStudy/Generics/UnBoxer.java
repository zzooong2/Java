package Generics;

public class UnBoxer {
	public static <T extends Number> T openBox(Box<T> box) {
		System.out.println("Unboxed data :" + box.get().intValue());
		return box.get();
	}
}
