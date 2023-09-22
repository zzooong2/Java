package OptionalFlatMap;

import java.util.Optional;

public class Company {
	String cName; // 친구 정보에 속하는 회사 정보
	Optional<ContInfo> cInfo; // null 일 수 있음
	
	public Company(String cn, Optional<ContInfo> ci) {
		cName = cn;
		cInfo = ci;
	}
	public String getCName() { return cName; }
	public Optional<ContInfo> getCInfo() { return cInfo; }	
}
