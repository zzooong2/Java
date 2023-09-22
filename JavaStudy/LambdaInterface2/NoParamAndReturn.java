package LambdaInterface2;

import java.util.Random;

public class NoParamAndReturn {
	public static void main(String[] args) {
		Generator gen = () -> {
			Random rand = new Random();
			return rand.nextInt(50);
		};
		
		System.out.println(gen.rand());
	}

}
