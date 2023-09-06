package JavaStudy;
class YummyCakeSize {
	public static void main(String[] args) {
		CheeseCake ca1 = new CheeseCake(5, 7);
		Cake ca2 = ca1;
		
		// ca2는 Cake형 이므로 ca2.size는 Cake의 멤버 size를 의미
		System.out.println("Bread Ounce : " + ca2.size);
		
		// ca1는 CheesCake형 이므로 ca1.size는 CheeseCake의 멤버 size를 의미
		System.out.println("Cheese Ounce : " + ca1.size);
		System.out.println();
		
		ca1.showCakeSize();
		System.out.println();
		ca2.showCakeSize();
	}
}