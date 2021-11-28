package testtttt;

import java.util.Scanner;

public class Ex13 {

	
	public static void main(String[] args) {
	//	배열과 반복문 
		int money;
		int unit[] = {50000,10000,1000,500,100,50,10,1};
		
		
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("정수를 입력하세요 ");
	money = scanner.nextInt();
	System.out.println("입력된 금액 :"+ money);
	scanner.close();
	
	for(int i =0; i<8;i++) {
		int count = 0;
		for(int a =0 ;;a++) {
			if((money)-(unit[i])>=0){
			count++;
			money-=unit[i];
			}else break;
				
		}System.out.println(unit[i]+"원 짜리 :"+ count+ "개 ");
		System.out.println("남은 금액 :"+ money+"원 ");
		System.out.println();
				
	}
	}
	
		
		
		
	}


