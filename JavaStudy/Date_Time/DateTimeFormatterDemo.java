package Date_Time;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class DateTimeFormatterDemo {
	public static void main(String[] args) {
		ZonedDateTime date = ZonedDateTime.of(LocalDateTime.of(2023, 4, 25, 11, 20),
				                               ZoneId.of("Asia/Seoul"));
		
		DateTimeFormatter fm1 = 
				DateTimeFormatter.ofPattern("yy-M-d");
		
		DateTimeFormatter fm2 = 
				DateTimeFormatter.ofPattern("yyyy-M-d, H:m:s");
		
		DateTimeFormatter fm3 = 
				DateTimeFormatter.ofPattern("yyyy-M-d, H:m:s VV");
		
		System.out.println(date.format(fm1));
		
		System.out.println(date.format(fm2));
		
		System.out.println(date.format(fm3));
		
		
	}

}
