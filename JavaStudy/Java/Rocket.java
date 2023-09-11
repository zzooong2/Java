package Java;
 class Rocket {
	 private int length;
	 private int radius;
	 
	 public Rocket(int a, int b) {
		 length = a;
		 radius = b;
	 }
	 
	 public void shootRocket() {
		 System.out.println("길이 : " + length);
		 System.out.println("각도 : " + radius);
	 }
 }