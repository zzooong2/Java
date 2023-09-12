package Generics2;

public class BoundedWildcardGenericMethod {
	public static void main(String[] args) {
		Box<Toy> tBox = new Box<>();
		BoxHandler.inBox(tBox, new Toy());
		BoxHandler.outBox(tBox);
		
		Box<Robot> rBox = new Box<>();
		BoxHandler.inBox(rBox, new Robot());
		BoxHandler.outBox(rBox);
		
	}

}
