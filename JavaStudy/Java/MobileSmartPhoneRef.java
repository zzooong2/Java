package Java;
class MobileSmartPhoneRef {
	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("010-555-777", "Nougat");
		MobilePhone ph2 = new SmartPhone("010-999-333", "Nougat");
		ph1.answer(); // 전화를 받는다.
		ph1.playApp(); // 앱을 선택하고 실행한다.
		System.out.println();
		
		ph2.answer();
		// ph2.playApp();
	}
}