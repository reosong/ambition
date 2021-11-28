package ContolSatement;

import java.io.IOException;
import java.util.concurrent.ForkJoinTask;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("한문자를 입력하세요 ");
		int abc = System.in.read();
		
		boolean cc = (abc>=65 && abc<=90) || ( abc>=97 && abc<=122)||(abc>='0'&&abc<='9');
		if(cc) System.out.println("알파벳 혹은 숫자 ");
		if(!cc) System.out.println("기타");

		System.in.skip(2);
		//2개 값을 스킵함 엔터키에 \r\n이 붙어 있어서 2개를 스킵해줘야지 한개의 값만 인정
		//컴퓨터를 이해하기 너무 어렵다잉...
	
		System.out.println("한 문자를 입력하세요");
		int some = System.in.read.line();
		if(some>='0'&& some<='9' ) {
			if(some%2==0)System.out.println("2의 배수입니다");
			if(some%2!=0)System.out.println("2의 배수가 아닙니다.");
		}
		
		
		
	}

}
