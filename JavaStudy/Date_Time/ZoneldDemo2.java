package Date_Time;

import java.time.ZoneId;

public class ZoneldDemo2 {
	public static void main(String[] args) {
		ZoneId.getAvailableZoneIds()
		      .stream()
		      .filter(s -> s.startsWith("Asia"))
		      .sorted()
		      .forEach(s -> System.out.println(s));
	}

}
