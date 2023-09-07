package JavaStudy;
class Printer {
	public void printContents(Printable doc) {
		if(doc instanceof Upper) {
			System.out.println((doc.getContents()).toUpperCase());
		}
		else if(doc instanceof Lower) {
			System.out.println((doc.getContents()).toLowerCase());
		}
		else
			System.out.println(doc.getContents());
	}
}