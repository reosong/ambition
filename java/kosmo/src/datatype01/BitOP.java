package datatype01;

public class BitOP {

	public static void main(String[] args) {
		/*
		 * 논리합 (&)(and)
		 * 논리곱 (|)(or)
		 * 
		 * 쉬프트 연산자
		 * 두 항이 반드시 정수여야한다
		 * 정수 << 비트수 왼쪽으로 비트수만큼 이동하고 오른쪽에 남은비트는 0으로 채움
		 * 정수 >>비트수 오른쪽으로 비트수만큼 이동하고 왼쪽에남은비트는
		 * 부호비트로 채운다 
		 * 
		 */

		byte num1 =45;
		byte num2= 25;
		//byte result = num1 &num2; 비트 연산결과는 int형이라서 
		int result = num1&num2;
		
		byte b1 =10, bit1 =2;
		result = b1 << bit1;
		System.out.println(result);
		
		
		b1=-9;
		result =b1>>bit1;
		System.out.println(result);
		
		
		
		
		
		
	}

}
