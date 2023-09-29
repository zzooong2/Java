package Date_Time;

import java.time.LocalDate;

public class LocalDateDemo1 {
	public static void main(String[] args) {
		// 오늘
		LocalDate today = LocalDate.now();
		System.out.println("Today : " + today);
		
		// 올 해의 크리스마스
		LocalDate christmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("Christmas : " + christmas);
		
		// 올 해의 크리스마스 이브
		LocalDate eve = christmas.minusDays(1);
		System.out.println("Chirstmas Eve : " + eve);
	}

}
