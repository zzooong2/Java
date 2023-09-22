package OptionalFlatMap;

import java.util.Optional;

public class NullPointerCaseStudy3 {
	public static void showCompAddr(Optional<Friend> f) { // 친구가 다니는 회사 주소출력
		String addr = f.flatMap(Friend::getCmp)
				       .flatMap(Company::getCInfo)
				       .flatMap(ContInfo::getAdrs)
				       .orElse("주소 없음");
		
		System.out.println(addr);
				       
				
	}
	
	public static void main(String[] args) {
		Optional<ContInfo> ci = Optional.of(
				new ContInfo(Optional.ofNullable(null), Optional.of("대한민국"))
				);
		Optional<Company> cp = Optional.of(new Company("Yaho co., Ltd.", ci));
		Optional<Friend> frn = Optional.of(new Friend("LEE SU", cp));
		showCompAddr(frn);
	}

}
