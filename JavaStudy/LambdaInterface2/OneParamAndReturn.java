package LambdaInterface2;

public class OneParamAndReturn {
	public static void main(String[] args) {
		HowLong hl = s -> s.length();
		System.out.println(hl.len("I am so tired"));
		
	}

}
