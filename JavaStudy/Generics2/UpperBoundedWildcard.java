package Generics2;

public class UpperBoundedWildcard {
	public static void main(String[] args) {
		Box<Integer> iBox = new Box<>();
		iBox.set(1234);
		Box<Double> dBox = new Box<>();
		dBox.set(10.009);
		
		Unboxer.peekBox(iBox);
		Unboxer.peekBox(dBox);
	}

}
