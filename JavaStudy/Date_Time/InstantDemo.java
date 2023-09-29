package Date_Time;

import java.time.Instant;
import java.time.Duration;

public class InstantDemo {
	public static void main(String[] args) {
		Instant start = Instant.now(); // 현재 시각 정보를 담음
		System.out.println("시작 : " + start.getEpochSecond());
		
		System.out.println("Time flies like an arrow.");
		
		Instant end = Instant.now(); // 현재 시각 정보를 담음
		System.out.println("끝 : " + end.getEpochSecond());
		
		Duration between = Duration.between(start, end); // 두 시각의 차 계산
		System.out.println("밀리 초 단위 차 : " + between.toMillis());
	}

}
