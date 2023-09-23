package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringStream2 {
	public static void main(String[] args) {
		String[] names = {"YOON", "KIM", "PARK"};
		Arrays.stream(names)
		      .forEach(s -> System.out.println(s));
		
	}
	

}
