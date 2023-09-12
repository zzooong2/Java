package Generics2;

public class GetableGenericInterface {
	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		box.set(new Toy());
		
		Getable<Toy> gt = box;
		System.out.println(gt.get());
		
	}

}
