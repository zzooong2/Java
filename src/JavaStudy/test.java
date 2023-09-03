package JavaStudy;
public class test {
	public static void main(String[] args) {
		plusNumber(7, 3);
	}
	
	public static void plusNumber(int i, int j) {
		System.out.println("덧셈 : " + (i + j));
		System.out.println("뺄셈 : " + (i - j));
		System.out.println("나눗셈 : " + (i / j));
		System.out.println("곱셈 : " + (i * j));
		System.out.println("나눗셈의 나머지 값 : " + (i % j));
	}
}