package Optional;

public class NullPointerCaseStudy {
	public static void showCompAddr(Friend f) { // 친구가 다니는 회사 주소출력
		String addr = null;
		
		if(f != null) {
			Company com = f.getCmp();
			if(com != null) {
				ContInfo info = com.getCInfo();
				if(info != null)
					addr = info.getAdrs();
			}
		}
		if(addr != null)
			System.out.println(addr);
		else
			System.out.println("There's no address information.");
	}
	
	public static void main(String[] args) {
		ContInfo ci = new ContInfo("321-444-5577", "대한민국");
		Company cp = new Company("Yaho Co., Ltd.", ci);
		Friend frn = new Friend("Lee SU", cp);
		
		showCompAddr(frn);
	}

}
