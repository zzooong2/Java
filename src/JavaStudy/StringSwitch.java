package JavaStudy;
class StringSwitch {
	public static void main(String[] args) {
		String str = "two";
		
		switch(str) {
		case "one":
		    System.out.println("one");
		    break;
		case "two":
	        System.out.println("two");
	    break;
	    default:
	        System.out.println("default");
		}
	}
}