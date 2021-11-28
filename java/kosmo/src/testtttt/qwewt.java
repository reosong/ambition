package testtttt;

import java.io.IOException;
import java.util.Scanner;

public class qwewt {

	public static void main(String[] args) throws IOException {
		
	boolean run =true;
	int balance= 0;
	Scanner scanner = new Scanner(System.in);
	
	while(run) {
		System.out.println("---------------------");
		System.out.println("1예금 2 출금 3잔고 4종료");
		System.out.println("---------------------");
		System.out.println("선택>");
		
	
	int m= scanner.nextInt();
	
	switch(m) {
	case 1:
		System.out.println("예금액");
		balance += scanner.nextInt();
		System.out.println("잔고:"+balance);
		break;
	case 2:
		System.out.println("출금액");
		balance -= scanner.nextInt();
		break;
	case 3:
		System.out.println("잔고 ");
		System.out.println(balance);
		break;
		
	case 4:
		run =false;
		break;
		
		
	
		
	}
		
		
	}
		
		
		
		
		
	}

}
