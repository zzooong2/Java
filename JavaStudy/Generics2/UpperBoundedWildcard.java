package Generics2;

public class UpperBoundedWildcard {
	public static void main(String[] args) {
		Box<Integer> iBox = new Box<>();
		iBox.set(2345);
		Box<Double> dBox = new Box<>();
		dBox.set(3.14);
		
		Unboxer.peekBox(iBox);
		Unboxer.peekBox(dBox);
	}

}
