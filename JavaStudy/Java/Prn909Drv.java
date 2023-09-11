package Java;

class Prn909Drv implements ColorPrintable { 
	@Override
	public void print(String doc) { // 오버라이딩 관계 성립
		System.out.println("From MD-909 black & white ver");
		System.out.println(doc);
	}
	@Override
	public void printCMYK(String doc) {
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
}