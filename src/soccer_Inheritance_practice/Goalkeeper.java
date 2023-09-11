package soccer_Inheritance_practice;

public class Goalkeeper extends Player {
	public void Goalkeeper() {
		this.name = "김승규";
		this.country = "대한민국";
		this.position = "골키퍼";
		this.age = 30;
		this.height = 198;
		
		System.out.println("이름:" + name + "국적:" + country + "포지션:" + position + "나이:" + age + "키:" + height);
		
		Goalkeeper gp = new Goalkeeper();
		gp.run();
		gp.shoot();
		gp.pass();
		gp.save();
		
		
	}
	public void run() {
		System.out.println("달리기");
	}
	public void shoot() {
		System.out.println("슛");
	}
	public void pass() {
		System.out.println("패스");
	}
	public void save() {
		System.out.println("결정적인 세이브!");
	}
}