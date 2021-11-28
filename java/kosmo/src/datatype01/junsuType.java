package datatype01;

public class junsuType {
	public static void main(String[] args) {
		/*
		 * 원칙 1 큰자료형과 작은 자료형의 연간 결과는 큰 자료형을 따른다
		 * 2 같은 자료형끼리의 연산결과는 ㄴ같은 자료형이된다
		 * 
		 */
		
		byte b1; 
		b1 = 127;
		
		int 국 = 89;
		int 영 = 99;
		int 수 = 78;
		int 국영수 = (국+ 영 + 수);
		System.out.println("국어점수는:"+ 국 );
		System.out.println("영어점수는:"+ 영 );
		System.out.println("수학점수는:"+ 수 );
		System.out.println("총점수는:" +국영수);
		
		
		
		int num1 = 0;
		num1 += 200;
		System.out.println(num1);
		int num2 = 20;
		num2 %= num1; // num2 = num2%num1;
		System.out.printf("num2 %d , num1 %d\n",num2, num1);
		System.out.println(10);
		
		
		num2 *=2+100;// num2= num2*(2+100)
		System.out.printf("num2 %d\n", num2);
		
		/*
		 * 증감연산자(단형연산자) ++ --
		 * ++는 자기자신을 1증가시킨다
		 * --는 자기자신을 1감소시킨다
		 * 단독으로 쓰일때는 항이 증감연산자
		 * 앞에 붙거나 뒤에 붙거나 결과는 같다
		 * 하지만 다른 연산자와 결합할 때는
		 * ++ 변수 :먼저 자신을 증감시킨다
		 * 변수 ++  : 다른연산을 수행한후 자신을 증감시킨다
		 */
		int num3 =10;
		num3 ++; // num3 = num3 +1
		System.out.println(num3);
		++num3;
		System.out.println(num3);
		++num3;
		System.out.println(num3);
		
		
		//다른 연산과 함께 사용시 
		int num4 =10;
		int result = num4+ num3++;
		int result1 = num4+ ++num3;
	
		System.out.println(result);
		System.out.println(result1);
		
		int num5 = 10;
		System.out.println(num5);
		System.out.println(++num5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	}

}
