package ContolSatement;

import java.io.IOException;
import java.util.Scanner;

public class switchstatement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * switch 문 if  처럼 조건에 따라서 분기하는 제어문
		 * 
		 * 형식 :
		 * 정수식(산술식)
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 ");
		int inputNumber = sc. nextInt();
		System.out.println("입력한 숫자 "+inputNumber);
		int remain = inputNumber %3;
		System.out.println("if문으로 나머지값 판단");
		if(remain==0) System.out.println("나머지가 0 ");
		else if(remain==1) System.out.println("나머지가 1");
		else System.out.println("나머지가 2");
		
		
		
		//switch 문으로 나머지값 단
		switch (remain){
			case 0:
				System.out.println("나머지가 0 ");
				break;
			case 1:
				System.out.println("나머지가 1 ");
				break;
			default:
				System.out.println("나머지가 2");
				
		
		}
		
		byte b =3;
		switch(b) {
		
		case 1 :
			System.out.println("b에 저장된 값 1");
		case 2 :
			System.out.println("b에 저장된 값 2");
		case 3 :
			System.out.println("b에 저장된 값 3");
			break;
			/*
			 * break 가 없는경우 
			 * 먼저 해당 case를찾고 
			 * 다른 case의명령문들도 모두 차레로 실핼됨
			 * 그러므로 반드시 break를 추가해라
			 */
		case 4 :
			System.out.println("b에 저장된 값 4");
			
		}
		
		
		
		
		
		
		long ln =5;
		
		//switch(ln) 암됨
		//switch (ln%5) 안
		
		System.out.println("첫번째 숫자 입력? ");
		int fnum = sc.nextInt();
		System.out.println("연산자 기호입력 ");
		char op =(char) System.in.read();
		System.out.println("두번째 숫자 입력 ");
		int snum= sc.nextInt();
		System.out.printf("fnum %d , sum %d , p[ %c%n", fnum,snum, op);
		switch (op) {
		case '+' :
			System.out.printf("%d +% d= %d%n", fnum, snum, op);
			break;
		case '-' :
			break;
		case '*' :
			break;
		case '/' :
			break;
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
