package Generics2;

public class BoundedWildcardUsage2 {
	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}

}
