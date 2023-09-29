package Date_Time;

import java.util.List;
import java.util.Arrays;
import java.time.Instant;
import java.time.Duration;

public class HowLongSequential {
	public static long fibonacci(long n) {
		if( n==1 || n==2)
			return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(40, 41, 42, 43, 44, 45);
		
		Instant start = Instant.now(); // 스톱워치 시작
		nums.stream()
		    .map(n -> fibonacci(n))
		    .forEach(r -> System.out.println(r));
		
		Instant end = Instant.now(); // 스톱워치 멈춤
		System.out.println("Sequential Processing: " + Duration.between(start, end).toMillis());
	}

}
