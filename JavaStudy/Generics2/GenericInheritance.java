package Generics2;

public class GenericInheritance {
	public static void main(String[] args) {
		Box<Integer> iBox = new SteelBox<>(7959);
		Box<String> sBox = new SteelBox<>("Simple");
		System.out.println(iBox.get());
		System.out.println(sBox.get());
	}

}
