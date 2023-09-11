package Inheritance;

public class Player {
	static String name;
	static String country;
	static String position;
	static int age;
	static int height;
	
	
	public static void main(String[] args) {
		Attacker ak = new Attacker();
		ak.Attacker();
		
		System.out.println();

		Deffender df = new Deffender();
		df.Deffender();
		
		System.out.println();
		
		Goalkeeper gk = new Goalkeeper();
		gk.Goalkeeper();
		
		System.out.println();
		
		try {
			int injuryperiod = 3;
			ak.tackle();
		}
		catch(InjuryPeriodException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void tackle() throws InjuryPeriodException{
	    String name = "손흥민";
		
		String tackling = "심한 태클이 들어갑니다.";
		int injuryperiod = 3;
		
		System.out.println(name + " 선수에게" + tackling);
		System.out.println("부상기간은 " + injuryperiod + "주 입니다.");
		
		if(injuryperiod < 4) {
			throw new InjuryPeriodException();
		}
	}
}