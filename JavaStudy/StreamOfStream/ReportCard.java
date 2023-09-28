package StreamOfStream;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;


public class ReportCard {
	private int kor;
	private int eng;
	private int math;
	
	public ReportCard(int k, int e, int m) {
		kor = k;
		eng = e;
		math = m;
	}
	
	public int getKor() { return kor; }
	public int getEng() { return eng; }
	public int getMath() { return math; }
	

}
