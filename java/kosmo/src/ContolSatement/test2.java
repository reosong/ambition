package ContolSatement;

import java.io.IOException;

public class test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("한글자를 입력하세요");
		int qq = System.in.read();
		if (qq>'0'&& qq<='9')
		{if(qq%2==0)System.out.println("2의 배수입니다 ");
			else System.out.println("2의 배수가 아닙니다. ");}
		else 
			{if(qq>='a'&& qq<='z')System.out.println("소문자");
			if(qq>='A'&& qq<='Z')System.out.println("대문자 ");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
