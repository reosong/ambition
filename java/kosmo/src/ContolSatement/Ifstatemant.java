package ContolSatement;

import java.io.IOException;

public class Ifstatemant {

	public static void main(String[] args) throws IOException {
	/*
	 * if문 기본형식2]
	 * if (조건식){
	 * 조건식이 참이면 실핼할 명령문;
	 * }
	 * else{
	 * 	조건식이 거짓일때 실핼할 명령문;
	 * }
	 * 
	 */
		
		
	int num1=100;
	System.out.println("[if문 형식 첫번째로 짝/홀수 판단]");
	//조건식이 두번 실행
	if(num1%2==0) System.out.println("짝수 ");
	if(num1%2!=0) System.out.println("홀수 ");
	
	System.out.println("if문 형식 두번째로 짝/홀수 판단"  );
	if(num1%2==0)
		System.out.println("짝수 ");
	else
		System.out.println("홀수");
	
	
	/*
	 * 삼항연산자
	 * if else 문과 같다
	 * 코드를 짧게 표현할때 주로 사용(if ~else 대신)
	 * 
	 * 구문]
	 * 변수= 조건식 ? 참일때 값: 거짓일 떄 값
	 * 
	 * 
	 */
		
	String result = num1%2==0?"짝수" : "홀수 "; 
	System.out.println(result);
	
	
	//짝홀수판단 후 짝수인 경우 100 이상인지 판단
	if(num1%2==0) {
		if(num1>=100)System.out.println("짝수이면서 100이상 ");
		else System.out.println("짝수이면서 100미만");	
	}
	
		
		//짝홀수 판단후 짝수인경우 100이상인지 판단 삼항연산자 ? : ;
	System.out.println(num1%2==0&&num1>=100 ? "짝수" : "홀수 ");
		
		
		//else는 항상 if문과 짝을 이루어야한다
	
	
	
	//문자를 입력받아 숫자인지 아닌지 if ~else문과 삼항연산자를 이용하여 한단
	
	
	
	System.out.println("문자를 입력하세요 ");
	int a = System.in.read();
	
	if(a>='0' && a<='9')
		System.out.println("숫자입니다 ");
	else
		System.out.println("숫자가 아닙니다. ");
		
	System.out.println(a>='0' && a <='9'? "숫자입니다.":"숫자가 아닙니다.");
	
	
	char word = (char)System.in.read();
	if (word>='0'&& word<='9') {
		
	}
	
	
	System.in.skip(1);
	System.out.println("한글자를 입력하세요");
	int qq = System.in.read();
	if (qq>'0'&& qq<=9) {
		if(qq%2==0)System.out.println("2의 배수입니다 ");
		else System.out.println("2의 배수가 아닙니다. ");
		
	}
	else {
		if(qq>='a'&& qq<='z')System.out.println("소문자");
		if(qq>='A'&& qq<='Z')System.out.println("대문자 ");
		
	}
	
	
	
	
	
	
	
	
	
		
	}

}
