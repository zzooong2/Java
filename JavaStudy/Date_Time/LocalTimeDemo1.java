package Date_Time;

import java.time.LocalTime;

public class LocalTimeDemo1 {
	public static void main(String[] args) {
		// 현재 시각
		LocalTime now = LocalTime.now();
		System.out.println("지금 시각 : " + now);
		
		// 2시간 10분 뒤 화상 미팅 시작
		LocalTime mt = now.plusHours(2);
		mt = mt.plusMinutes(10);
		
		// 화상미팅 시작
		System.out.println("화상 미팅 시작 시각 : " + mt);
	}

}
