package OverloadingTest;

public class Manchester {
	public void united() {
		System.out.println("Glory");
	}
	
	String united(String mu) {
		System.out.println("Glory, Glory Man-United!");
		return mu.toString();
	}
	
	void united(Integer a) {
		System.out.println("우승횟수 : " + a);
	}
	

}
