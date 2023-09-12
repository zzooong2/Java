package Generics2;

public class GetableGenericInterface2 {
	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		box.set(new Toy());
		
		Getable<String> gt = box;
		System.out.println(gt.get());
		
	}

}
