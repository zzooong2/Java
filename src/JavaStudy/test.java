package JavaStudy;
public class test {
    public static void main(String[] args) {
         	System.out.println(3147483647l + 3147483648l);
        	
        	byte num1 = 5;
        	short num2 = 25;
        	System.out.println(num1);
        	System.out.println(num2);
        	
        	byte seven = 0B111;
        	int num205 = 0B11001101;
           	System.out.println(seven);
        	System.out.println(num205);
        	
        	int num = 100_000_000;
        	System.out.println(num);
        	
        	System.out.println("오늘의 환율은 1$에 0.88\u20ac입니다.");
        	
        	double pi = 3.1415;
        	int wholeNumber = (int)pi;
        	System.out.println((int)pi);
        	
        	switch(2) {
        	case 1:
        	case 2:
        	case 3:
        		System.out.println("case 1, 2, 3");
        	    break;
        	default:
        		System.out.println("default");
        	}
  	}
}