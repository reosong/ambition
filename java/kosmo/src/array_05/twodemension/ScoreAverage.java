package array_05.twodemension;

public class ScoreAverage {

	public static void main(String[] args) {
		//2차원 배열로 학년의 학 학기별로 (1학기 2학기) 성적을 저장, 4년간 전체 평점
		//평균을 구하는 프로그램 
		double score[][] = 
			{ {3.3, 3.4}, //1학년 (1학기,2학기)
				{3.5, 3.6}, //2학년 (1학기, 2학기)
				{3.7, 4.0}, //3학년 (1학기,2학기)						
				{4.1,4.2} }; //4학년 (1학기 ,2학기)
		double sum= 0;
		int n = 0;
		for (int year =0; year<score.length;year++) {
			for(int term = 0; term< score[year].length;term ++) {
				sum += score[year][term];		//전체 점수의 합 
				n++;
			}
		}
		
	
		System.out.println("4학년 전페 성적의 합 :"+ sum);
		System.out.println("4학년 전체 평균 : "+sum/n);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
