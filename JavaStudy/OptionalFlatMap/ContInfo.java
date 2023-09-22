package OptionalFlatMap;

import java.util.Optional;

public class ContInfo { // 회사 정보에 속하는 회사연락처
	Optional<String> phone;
	Optional<String> adrs;
	
	public ContInfo(Optional<String> ph, Optional<String> ad) {
		phone = ph;
		adrs = ad;
	}
	
	public Optional<String> getPhone() { return phone; }
	public Optional<String> getAdrs() { return adrs; }

}
