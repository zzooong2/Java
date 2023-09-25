package StreamOfStream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CreateIntStream {
	public static void showIntStream(IntStream is) {
		is.forEach(n -> System.out.print(n + '\t'));
			System.out.println();
	}
	
	public static void main(String[] args) {
		IntStream is3 = IntStream.of(7, 5, 3); // 인자로 전달한 값을 스트림으로
		showIntStream(is3);
		
		IntStream is4 = IntStream.of(5, 8); // 인자로 전달한 값을 스트림으로
		showIntStream(is4);
		
		IntStream is5 = IntStream.of(5, 8); // 인자로 전달한 값을 스트림으로
		showIntStream(is5);
	}

}
