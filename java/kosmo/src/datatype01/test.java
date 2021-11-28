package datatype01;

import java.util.Scanner;

public class test {


	public static void main(String[] args) 
	
	
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 입력 ");
		int kor = sc.nextInt();
		System.out.println("영어점수 입력 ");
		int eng = sc.nextInt();
		System.out.println("수점수 입력 ");
		int math = sc.nextInt();
		int sum = (kor+ eng+ math)/30;
		
		switch(sum) {
		case 10 : System.out.println("A");
		break;
		case 9 : System.out.println("A");
		break;
		case 8 :System.out.println("B");
		break;
		case 7: System.out.println("C");
		case 6 : System.out.println("D");
		default : System.out.println("F");
			
		}
		
		
		
		
		System.out.println("메달색을 입력해주세요 (gold sliver breonze");
		String medal = sc.next();
		switch(medal){
		case "gold" : System.out.println("금메달입니다 "); break;
		case "sliver" : System.out.println("은메달입니다 "); break;
		case "bronze": System.out.println("동메달입니다 "); break;
		default: System.out.println("메달이 없습니다. ");
		}
		
		
		
		
		
	}

}
