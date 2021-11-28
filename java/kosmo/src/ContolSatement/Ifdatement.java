package ContolSatement;

import java.io.IOException;

public class Ifdatement {

	public static void main(String[] args) throws IOException {
		//if -범위를 가지는 값
		//분기문(조건문) 프로그램 흐름상 분기하고자 할 때 사용하는  제어문
		//if문 /switch 문 두가지가있
		//if문 기본형식
		/*
		 *조건식은 비교식내지 논리식이어야 한다
		 *즉 결과깁이 참 아니면 거짓이 나오는 식이거나
		 *직접 boolean 을 줄 수잇다
		 *if(조건식) ==참 => 조건문 실행
		 *
		 *조건식이 참일 때 실행할 명령문이 하나이면 {} 생락가능하다
		 *{}는 실행문을 하나로 묶는 블락역할 한다.
		 *
		 */
		
		
		
		int num1= 10 ;
		//조건식은 비교식 아니면 논리식 혹은 boolean 값(참 거짓)
		if (num1%2==0) { //비교식
			System.out.printf("%d는 짝수 ",num1);
			
		}
		
		
		//2]if (조건식) ; 는 조건식이 참일때 
		//				수행할 명령문이 없음을 의미(조심)
		
		
		//3]조건식이 참일때 수행할 명령문이 하나인경우 {} 생략가능
		
		if(num1%2==0) System.out.printf("%d는 짝수 %n",num1);
		
		//3-1] 수행할 명령문이 여러개인경우 {} 를 생략하면 의도하지 않은 결과 초래
		//그러므로 저건식이 참일때수행할 명령문이 여러개인 경우는 반듯이{}
		if (num1%2 == 0) {
			System.out.printf("num1은 %d이다\n", num1);
			System.out.printf("%d는 홀수이다\n", num1);
		}
		
		/*system.in.read() 매소드
		 * 사용자가 입력을 받을때까지 블락상태가 된다
		 * 즉 다음코드가 실행이 안된다
		 * 입력한 문자의 아스키코드 값 변환
		 */
		System.out.println("1.한문자를 입력하세요");
		int asciicode = System.in.read();
		
		
		System.out.println("사용자가 입력한 문자의 아스키코드값 "+asciicode);
		//사용자가 입력한 문자가 숫자인지 아닌지를 판단하자
		//1]아스키 코드값을 알 때
		boolean isNumber = asciicode>=48 && asciicode <=57;
		if(isNumber) System.out.println("입력한 문자는 숫자입니다 ");
		if(!isNumber) System.out.println("입력한 문자는 숫자가 아니다 ");
		
		//2]아스키 코드값을 모를때 
		
		isNumber = asciicode>='0' && asciicode <='9';
		if(isNumber) System.out.println("입력한 문자는 숫자입니다 ");
		if(!isNumber) System.out.println("입력한 문자는 숫자가 아닙니다. ");
		
		
		
		
		
		
		
		
		
		int abc = System.in.read();
		
		boolean cc = (abc>=65 && abc<=90) || ( abc>=97 && abc<=122);
		if(cc) System.out.println("알파벳 혹은 숫자 ");
		if(cc) System.out.println("기");

		
		
	}

}
