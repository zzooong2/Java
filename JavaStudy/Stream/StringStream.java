package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringStream {
	public static void main(String[] args) {
		String[] names = {"YOON", "KIM", "PARK"};
		Stream<String> stm = Arrays.stream(names);
		stm.forEach(s -> System.out.println(s));
	}
	

}
