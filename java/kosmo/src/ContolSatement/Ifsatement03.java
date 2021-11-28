package ContolSatement;

import java.io.IOException;

public class Ifsatement03 {


	public static void main(String[] args) throws IOException {
		/*
		 * if 1{}
		 * 조건식이 참일때 실행할 명령문
		 * }
		 *else if{ 
		 *	조건식2가 참일때 실행할 명령문
		 *}
		 *else if{ 
		 *	조건식 3이 참일때 실행할 명령문
		 *}
		 *else{ 
		 *모든 조건식이 거짓일 때 실행할 명령문
		 *}
		 */
		
		int kor=99, eng=80, math=89;
		double avg =(kor+eng+math)/3.0;
		if(avg>=90) System.out.println("A학점");
		else if (avg>=80 && avg<90) System.out.println("B학점");
		else if (avg>=70 && avg <80) System.out.println("c학점");
		else System.out.println("D학점");
		
		
		
		
		System.out.println("한문자를 입력하세요");
		char aa =(char) System.in.read();
		
		
		if (aa>='0' && aa<='9') {
			if(aa%2==0)System.out.println("2의 배수입니다 ");
			else System.out.println("2의 배수가 아닙니다.");
		}
		else if (aa>= 'a' && aa<='z') System.out.println("소문자입니다 ");
		else if (aa>='A' && aa<='Z') System.out.println("대문자입니다 ");
		else System.out.println("나도 몰라");
		
		
		
		System.in.skip(1);
		
		System.out.println("한글자를 입력하세요 ");
		char bb = (char)System.in.read();
		
		if (bb>='0' &&bb<='9') System.out.println("숫자 ");
		else if ((bb>='a'&& bb<= 'z') ||(bb>='A' && bb<='Z'));
			System.out.println("알파");
		
		else System.out.println("기타 ");
		
		
	}

}
