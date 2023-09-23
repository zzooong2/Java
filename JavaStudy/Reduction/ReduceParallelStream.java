package Reduction;

import java.util.List;
import java.util.Arrays;
import java.util.function.BinaryOperator;

public class ReduceParallelStream {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
		
		BinaryOperator<String> lc = (s1, s2) -> {
			if(s1.length() > s2.length())
				return s1;
			else
				return s2;
		};
		
		String str = ls.parallelStream() // 병렬 처리를 위한 인스턴스 생성
				       .reduce("", lc);
		System.out.println(str);
	}

}
