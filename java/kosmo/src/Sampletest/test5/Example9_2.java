package Sampletest.test5;

import java.util.Scanner;

public class Example9_2 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum =0;
		int[]scores = null;
		Scanner scanner = new Scanner(System.in);
		

		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1학생수 2점수입력 3점수리스트 4 분석 종료");
			System.out.println("---------------------------");
			System.out.println("선택>");
			
			
			int selectNO= scanner.nextInt();
			
			if(selectNO ==1) {
			
			System.out.println("학생수를 입력하세요 ");
			studentNum = scanner.nextInt();
			scores = new int[studentNum];
		
				
			}
			else if(selectNO ==2) {
				for(int i = 0; i<scores.length;i++){
					System.out.println("점수를 입력하세요 ");
				scores[i]= scanner.nextInt();
					
				}
				
							
			}
			
			else if(selectNO ==3) {
				
				for(int i =0; i<scores.length;i++) {
					System.out.println("score["+i+ "] :"+ scores[i]);
				}
				
			}
			else if(selectNO ==4) {
				int high=0;
				int sum= 0;
				for(int i = 0; i<scores.length;i++) {
					high= (scores[i]<high)? high: scores[i];
					sum += scores[i];
					
				}
				
				System.out.println("최대값 : "+ high);
				System.out.println("평균 : "+ (double)sum/ scores.length);
				
				
				
			}
			else if(selectNO ==5) {
				run =false;
				
			}
						
			
			
			
		}
		
		
		System.out.println("프로그램 종료 ");
		
		
		
		
		
		

	}

}
