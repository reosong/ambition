package Sampletest.test5;

import java.util.Scanner;

public class exampleTest9 {

	public static void main(String[] args) {
	
		boolean run =true;
		int studentNum= 0;
		int[] scores =null;
		Scanner scanner = new Scanner(System.in);
		

		while(run) {
			System.out.println("--------------------------");
			System.out.println("1학생수 | 2점수입력 |3점수리스트 |4분석 |5종료 ");
			System.out.println("--------------------------");
			System.out.println(">선택 ");
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				System.out.println("학생 수를 입력하세요 ");
				int num =scanner.nextInt();
				studentNum= num;
				
				//System.out.println("학생수 입력 >");
				//studentNum = scanner.nextInt();
				//scores = new int[studentNum];
				 
			}else if (selectNo==2) {
				scores = new int[studentNum];
				System.out.println("점수를 입력하세요 ");
					for(int i =0 ; i<scores.length;i++) {
						scores[i]= scanner.nextInt();
			}
					
			// for( int i =0 ; i<scores.length; i++){
			//System.out.println("scores["+ i + "]:>");
			//scores[i] =scanner.nextInt();}		
					
					
					
					
			}else if (selectNo ==3) {
				for(int i =0; i<scores.length;i++) {
					System.out.println("scores["+i+"]>"+ scores[i]);
				}
				
				
			}else if (selectNo ==4) {
				int sum= 0;
				int high =0;
				for(int i =0; i<scores.length;i++) {
					sum+=scores[i];
					high=(high<scores[i])?scores[i]:high;
					
				double avg = (double) sum/ scores.length;
				System.out.println("최고점수 : "+high);
				
				System.out.println("평균: "+avg);
				}
				}else if(selectNo ==5) {
				run =false;
			}
					
					
			}		
					
		
		
		
		
		System.out.println("프로그램 종료 ");
		
		
		
	}

}
