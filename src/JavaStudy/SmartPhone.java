package JavaStudy;
class SmartPhone extends MobilePhone{
	private String androidVer; // 안드로이드 운영체제 네임(버젼)
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}