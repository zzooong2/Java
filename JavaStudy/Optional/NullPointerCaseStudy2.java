package Optional;

import java.util.Optional;

public class NullPointerCaseStudy2 {
	public static void showCompAddr(Optional<Friend> f) { // 친구가 다니는 회사 주소출력
		String addr = f.map(Friend::getCmp)
				       .map(Company::getCInfo)
				       .map(ContInfo::getAdrs)
				       .orElse("주소 없음");
		
		System.out.println(addr);
				       
				
	}
	
	public static void main(String[] args) {
		ContInfo ci = new ContInfo("321-444-5577", "대한민국");
		Company cp = new Company("Yaho Co., Ltd.", ci);
		Friend frn = new Friend("Lee SU", cp);
		showCompAddr(Optional.of(frn));
	}

}
