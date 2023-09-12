package Generics;

public class DBox<L, R> {
	private L left; // 왼쪽 수납 공간
	private R right; // 오른쪽 수납 공간
	
	public void set(L o, R r) {
		left = o;
		right = r;
	}
	
	public String toString() {
		return left + " & " + right;
	}
}
