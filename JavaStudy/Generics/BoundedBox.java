package Generics;

public class BoundedBox {
	public static void main(String[] args) {
		Box<Integer> iBox = new Box<>(); // Integer는 Number를 상속
		iBox.set(24);
		
		Box<Double> dBox = new Box<>(); // Double은 Number를 상속
		dBox.set(5.97);
		
		System.out.println(iBox.get());
		System.out.println(dBox.get());
	}
}
