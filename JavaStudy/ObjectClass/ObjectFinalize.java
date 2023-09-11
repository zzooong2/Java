package ObjectClass;

class ObjectFinalize {
	public static void main(String[] args) {
		Person p1 = new Person("YOON");
		Person p2 = new Person("PARK");
		
		p1 = null; // 참조대상을 가비지컬렉션의 대상으로 만듦
		p2 = null; // 참조대상을 가비지컬렉션의 대상으로 만듦
		
		// System.gc();
		// System.runFinalize();
		
		System.out.println("end of program");
		
	}
}
