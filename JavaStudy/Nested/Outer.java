package Nested;

public class Outer {
	private static int num = 0;
	static class Nested1 { // 스태틱 네스티드 클래스
		void add(int n) { num += n; }
	}
	static class Nedted2 {
		int get() { return num; }
	}

}
