package StreamOfStream;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.DoubleStream;

public class GradeAverage90 {
	public static void main(String[] args) {
		ReportCard[] cards = {
				new ReportCard(98, 84, 90),
				new ReportCard(92, 87, 95),
				new ReportCard(85, 99, 93)
		};
		
		boolean b1 = Arrays.stream(cards)
				.mapToDouble(r -> (r.getKor() + r.getEng() + r.getMath()) / 3.0 )
				.anyMatch(avg -> avg >= 90.0);
		System.out.println("평균 90점 이상이 한 명 이상 존재합니다." + b1);
		
		if(b1 == true) {
			boolean b2 = Arrays.stream(cards)
					.mapToDouble(r -> (r.getKor() + r.getEng() + r.getMath()) / 3.0 )
					.anyMatch(avg -> avg >= 90.0);
			System.out.println("모두 평균 90점 이상 입니다." + b1);
		}
	}
	

}
