package WrapperClass;

class AutoBoxingUnBoxing {
	public static void main(String[] args) {
		Integer iObj = 10; // AutoBoxing
		Double dObj = 3.14; // AutoBoxing
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();
		
		int num1 = iObj; // AutoUnBoxing
		double num2 = dObj; // AutoUnBoxing
		System.out.println(num1);
		System.out.println(num2);
		System.out.println();
		
		}
}
