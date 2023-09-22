package OpionalIfElse;

import java.util.Optional;

public class MapElseOptional {
	public static void main(String[] args) {
		Optional<ContInfo> ci = Optional.of(new ContInfo(null,"대한민국"));
		
		String phone = ci.map(c -> c.getPhone())
				         .orElse("폰 없음");
		
		String adrs = ci.map(c -> c.getAdrs())
		                .orElse("주소 없음");
		
		System.out.println(phone);
		System.out.println(adrs);
 
	}

}
