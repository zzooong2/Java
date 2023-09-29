package Date_Time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo2 {
	public static void main(String[] args) {
		// 한국 출발
		ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.of(2023, 12,9, 14, 30),
				                                    ZoneId.of("Asia/Seoul"));
		System.out.println("Departure : " + departure);
		
		// 파리 도착
		ZonedDateTime arrived =  ZonedDateTime.of(LocalDateTime.of(2023, 12,9, 17, 25),
                ZoneId.of("Europe/Paris"));
		System.out.println("Arrived : " + arrived);		
		
		// 비행 시간
		System.out.println(Duration.between(departure, arrived));
		
	}

}
