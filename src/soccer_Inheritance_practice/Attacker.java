package soccer_Inheritance_practice;

public class Attacker extends Player {
	public void Attacker() {
		this.name = "손흥민";
		this.country = "대한민국";
		this.position = "공격수";
		this.age = 32;
		this.height = 183;
		
		System.out.println("이름:" + name + "국적:" + country + "포지션:" + position + "나이:" + age + "키:" + height);
		
		Attacker ak = new Attacker();
		
		ak.run();
		ak.shoot();
		ak.pass();
		
		
	}
	public void run() {
		System.out.println("엄청 빠른 달리기");
	}
	public void shoot() {
		System.out.println("정교한 슛");
	}
	public void pass() {
		System.out.println("패스");
	}
}