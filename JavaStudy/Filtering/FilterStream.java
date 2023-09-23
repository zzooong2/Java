package Filtering;

import java.util.List;
import java.util.Arrays;

public class FilterStream {
	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5};
		Arrays.stream(ar) // 배열 기반 스트림 생성
		      .filter(n -> n%2 == 1) // 홀수만 통과
		      .forEach(n -> System.out.print(n + '\t'));
		System.out.println();
		
		List<String> sl = Arrays.asList("Toy", "Robot", "Box");
		sl.stream() // 컬렉션 인스턴스 기반 스트림 생
		  .filter(s -> s.length() == 3) // 길이가 3이면 통과
		  .forEach(s -> System.out.print(s + '\t'));
		System.out.println();
		
	}

}
