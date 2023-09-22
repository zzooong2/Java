package OptionalFlatMap;

import java.util.Optional;

public class FlatMapElseOptional {
	public static void main(String[] args) {
		Optional<ContInfo> ci = Optional.of(
			new ContInfo(Optional.ofNullable(null), Optional.of("대한민국"))
		);
		
		String phone = ci.flatMap(c -> c.getPhone())
				         .orElse("폰 없음");
		
		String adrs = ci.flatMap(c -> c.getAdrs())
		                 .orElse("주소 없음");
		
		
	   System.out.println(phone);
	   System.out.println(adrs);
		
	}
	

}
