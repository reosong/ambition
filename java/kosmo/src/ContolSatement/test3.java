package ContolSatement;

import java.io.IOException;

public class test3 {
	


	public static void main(String[] args) throws IOException {
		
		System.out.println("한글자를 입력하세요 ");
		char bb = (char)System.in.read();
		
		if (bb>='0' && bb<='9') { System.out.println("숫자 ");}
		else if ((bb >='a'&& bb <= 'z') || (bb >= 'A' && bb <= 'Z'));{
			System.out.println("알파벳 ");
		}
		//else { 
			//System.out.println("기타 ");
			//System.out.println("끝 ");
		
		
		System.in.skip(1);
		
		/*int num1 = 44 , num2 = 20, num3 =10;
		
		int max = 0;
		if(num2>num1);{
			if(num2>num3); max = num2;
			if(num2<num3); max = num3;
		}
		
		if(num1>num2);{
			if(num1>num3); max =num1;
			if(num1<num3); max= num3;
		}
		if(num1>num3);{
			if(num1>num2); max =num1;
			if(num1>num3); max =num3;
		}
		if(num1<num3);{
			if(num3>num2); max = num3;
			if(num3<num2); max = num2;
			
		}
		System.out.println(max);
		*/
		
		int num1 = 44, num2 =20, num3=10;
		if (num1 > num2 && num1 > num3) {
			System.out.println("최대값: " + num1);
		} 
		else if (num2 > num1 && num2 > num3) {
			System.out.println("최대값: " + num2);
		} 
		else System.out.println("최대값: " + num3);
		
		
		
		
		
	}

}
