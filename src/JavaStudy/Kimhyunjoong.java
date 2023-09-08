package JavaStudy;
public class Kimhyunjoong {
	public static void main(String[] args) {
		String doc = "노력하는 남자 김현중";
		
		Hyunjoong hj = new MakeJob();
		hj.print(doc);
		
		hj = new MakeFood();
		hj.print(doc);
	}
}