package StreamOfStream;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.function.BinaryOperator;

public class ToParallelStream {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
		Stream<String> ss = ls.stream(); //  스트링 생성
		
		BinaryOperator<String> lc = (s1, s2) -> {
			if(s1.length() > s2.length())
				return s1;
			else
				return s2;
		};
		
		String str = ss.parallel() // 병렬 스트링 생성
				       .reduce("", lc);
		System.out.println(str);
	}

}
