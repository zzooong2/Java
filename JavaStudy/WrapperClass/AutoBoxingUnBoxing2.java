package WrapperClass;

class AutoBoxingUnBoxing2 {
	public static void main(String[] args) {
		Integer num = 10; 
		num++; // AutoBoxing, AutoUnBoxing 동시에 진행		
		System.out.println(num);
		
		num += 3; // AutoBoxing, AutoUnBoxing 동시에 진행
		System.out.println(num);
		
		int r = num + 5; // AutoUnBoxing
		Integer rObj = num -  5; // AutoUnBoxing
		System.out.println(r);
		System.out.println(rObj);
		
		}
}
