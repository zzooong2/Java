package OverloadingTest;

public class Son extends Soccer{
	@Override
	public void print() {
		String name;
		name = "손흥민";
		System.out.println(name + "은 푸스카스 수상자, EPL 득점왕, 토트넘 주장");
	}

}
