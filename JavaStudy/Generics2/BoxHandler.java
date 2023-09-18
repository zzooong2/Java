package Generics2;

public class BoxHandler {
	public static void outBox(Box<Toy> box) { //
		Toy t = box.get(); // 상자에서 꺼내기
		System.out.println(t);
	}
	public static void inBox(Box<Toy> box, Toy n) {
		box.set(n); // 상자에 넣기 
	}

}
