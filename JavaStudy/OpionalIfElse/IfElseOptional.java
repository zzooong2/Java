package OpionalIfElse;

public class IfElseOptional {
	public static void main(String[] args) {
		ContInfo ci = new ContInfo(null, "대한민국");
		String phone;
		String adrs;
		
		if(ci.phone != null)
			phone = ci.getPhone();
		else
			phone = "폰 없음";
		
		if(ci.adrs != null)
			adrs = ci.getAdrs();
		else
			adrs = "주소 없음";
		
		System.out.println(phone);
		System.out.println(adrs);
	}

}
