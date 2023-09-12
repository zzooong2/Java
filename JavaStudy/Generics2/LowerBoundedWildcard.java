package Generics2;

public class LowerBoundedWildcard {
	public static void main(String[] args) {
		Box<Integer> iBox = new Box<Integer>();
		iBox.set(2345);
		
		Box<Number> nBox = new Box<Number>();
		nBox.set(new Integer(789456));
		
		Box<Object> oBox = new Box<Object>();
		oBox.set("My simple instance");
		
		Unboxer.peekBox(oBox);
		Unboxer.peekBox(nBox);
		Unboxer.peekBox(iBox);
		
		
	}
}
