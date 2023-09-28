package StreamOfStream;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class GradeAverage {
	public static void main(String[] args) {
		ReportCard[] cards = {
				new ReportCard(70, 80, 90),
				new ReportCard(90, 80, 70),
				new ReportCard(80, 80, 80)
		};
		
		// ReportCard 인스턴스로 이루어진 스트림 생성
		Stream<ReportCard> sr = Arrays.stream(cards);
		
		// 학생들 점수 정보로 이루어진 스트림 생성
		IntStream si = sr.flatMapToInt(r -> IntStream.of(r.getKor(), r.getEng(), r.getMath()));
		
		// 평균을 구하기 위한 최종 연산 average 진행
		double avg = si.average().getAsDouble();
		System.out.println("avg. " + avg);
	}
	

}
