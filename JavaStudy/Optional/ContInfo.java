package Optional;

public class ContInfo { // 회사 정보에 속하는 회사연락처
	String phone;
	String adrs;
	
	public ContInfo(String ph, String ad) {
		phone = ph;
		adrs = ad;
	}
	
	public String getPhone() { return phone; }
	public String getAdrs() { return adrs; }

}
