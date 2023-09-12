package Generics;

public class BoundedGenericMethod {
	public static void main(String[] args) {
		Box<Integer> sBox = BoxFactory.makeBox(new Integer(5959));
		int n = UnBoxer.openBox(sBox);
		System.out.println("Returned data: " + n);
	}
}
