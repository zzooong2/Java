package Generics2_interface;

public class GetableGenericInterface {
	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		box.set(new Toy());
		
		// Box<T> 가 Getable<T> 를 구하므로 참조 가능
		
		Getable<Toy> gt = box;
		System.out.println(gt.get());
		
		
	}

}
