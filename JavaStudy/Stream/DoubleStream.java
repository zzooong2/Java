package Stream;

import java.util.Arrays;

class DoubleStream {
	public static void main(String[] args) {
		double[] ds = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		Arrays.stream(ds)
		      .forEach(d -> System.out.print(d + '\t'));
		System.out.println();
		
		Arrays.stream(ds, 1, 4) // 인덱스 1부터 인텍스 4 이전까
		      .forEach(d -> System.out.print(d + '\t'));
		System.out.println();
	}

}
