package JavaStudy;
class AutoCallToString {
	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("12");
		stb.append(34);
		System.out.println(stb.toString());
		System.out.println(stb);
		
		Box box = new Box("Camera");
		System.out.println(box.toString());
		System.out.println(box);
		
	}
}