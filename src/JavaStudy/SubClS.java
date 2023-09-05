package JavaStudy;
class SubClS extends SuperCLS {
	public SubClS() { 
		System.out.println("con : SubCLS()");
	}
	public SubClS(int i) {
		super(i);
		System.out.println("con : SubCLS(int i)");
	}
	public SubClS(int i, int j) {
		super(i, j);
		System.out.println("con : SubCLS(int i, int j)");
	}
}