package Generics2;

public class BoxHandler {
	public static <T> void outBox(Box<? extends T> box) { //
		T t = box.get(); // 상자에서 꺼내기
		System.out.println(t);
	}
	public static <T> void inBox(Box<? super T> box, T n) {
		box.set(n); // 상자에 넣기 
	}

}
