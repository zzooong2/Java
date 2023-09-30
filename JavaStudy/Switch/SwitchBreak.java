package Switch;

public class SwitchBreak {
	public static void main(String[] args) {
		int n = 3;
		
		switch(n) {
		case 1:
		case 2:
		case 3:
			System.out.println("case 1, 2, 3");
			break;
		default :
			System.out.println("The best programing language");
		}
		
		System.out.println("Do you like Java");
	}

}
