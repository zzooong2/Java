package Generics2;

public class LowerBoundedWildcard {
	public static void main(String[] args) {
		Box<Integer> iBox = new Box<Integer>();
		iBox.set(5577);
		
		Box<Number> nBox = new Box<Number>();
		nBox.set(new Integer(9955));
		
		Box<Object> oBox = new Box<Object>();
		oBox.set("My Simple Instance");
		
		Unboxer.peekBox(iBox);
		Unboxer.peekBox(nBox);
		Unboxer.peekBox(oBox);
		
		
	}

}
