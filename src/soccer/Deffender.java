package soccer;

public class Deffender extends Player {
	public void Deffender() {
		this.name = "김민재";
		this.country = "대한민국";
		this.position = "수비수";
		this.age = 30;
		this.height = 183;
		
		System.out.println("이름:" + name + "국적:" + country + "포지션:" + position + "나이:" + age + "키:" + height);
		
		Deffender df = new Deffender();
		df.run();
		df.shoot();
		df.pass();
	
	
	}
	public void run() {
		System.out.println("빠른 달리기");
	}
	public void shoot() {
		System.out.println("슛");
	}
	public void pass() {
		System.out.println("정확한 패스");
	}
}