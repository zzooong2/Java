package Generics;

public class PrimitivesAndGeneric {
	public static void main(String[] args) {
		Box<Integer> iBox = new Box<Integer>();
		iBox.set(125); // 오토 박싱
		int num = iBox.get(); // 오토 언박싱
		System.out.println(num);
		
	}
}
