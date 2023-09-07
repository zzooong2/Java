package JavaStudy;

class PrinterDriver3 {
	public static void main(String[] args) {
		String myDoc = "This is a reprot about . . . .";
		ColorPrintable prn = new Prn909Drv();
		prn.print(myDoc);
		System.out.println();
		prn.printCMYK(myDoc);
	}
}