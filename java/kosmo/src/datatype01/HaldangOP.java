package operator02;

public class HaldangOP {

	public static void main(String[] args) {
		/*
		 * [할당(대입)연산자]
		 * =: 변수 = 값(변수)
		 * 오른쪽에 있는 값을 왼쪽의 변수에 할당(대입)한다.
		 * [복합대입연산자(축약표현)]
		 * +=, -=, *=,%=,/=..등등
		 * 변수 += 값(변수2) => 변수1  변수1+값 혹은 변수1 = 변수1+변수2
		 */
		//1]할당(대입)연산자
		int num1;//변수 선언
		//지역변수는 반드시 초기화 후 사용
		//int num2=num1+1;[x]초기화 안해서 오류
		num1 = 100;//값을 대입
		System.out.println(num1);
		int num2;
		num2 = num1;//변수 num1에 저장된 값을 대입
		System.out.println(num2);
		//10=num1;[x]
		
		//2]복합대입연산자(축약표현)
		//  산술연산자에만 적용
		num1 += 200; // num1 = num1 + 200;
		
		System.out.println(num1);
		System.out.printf("num1:%d, num2:%d%n", num1, num2);
		
		num1 %= num2; // num1 = num1%num2;

		System.out.printf("num1:%d,num2:%d%n", num1,num2);
		
		num2 *=2+100;//num2 = num2*(2+100)
		System.out.printf("num2:%d%n",num2);
		
		//num1 &&= num2;[x] //복합연산자는 산술연산자만 적용됨
		
		boolean b1=true, b2=false;
		System.out.println(b1&&b2);
		
		//b1 &&= b2;
		/*
		 * 증감연산자(단항연산자) :++ ,--
		 * ++는 자기자신을 1증가시킨다.
		 * --는 자기자신을 1감소시킨다.
		 * 단독으로 쓰일때는 항이 증감연산자
		 * 앞에 붙거나 뒤에 붙거나 결과는 같다.
		 * 하지만 다른 연산자와 결합할 때는 
		 * ++(--)변수:먼저 자신을 증감시킨다
		 * 변수++(--):다는연산을 수행한후 자신을 증감시킨다.
		 */
		//단독으로 사용시]
		int num3=10;
		//변수++(후위 연산자) - 항뒤에 붙은 경우
		num3++; //num3 = num3 + 1
		System.out.println(num3);
		//변수++(전위 연산자) - 항앞에 붙은 경우
		++num3;
		System.out.printf("num3:%d%n",num3);
		
		//다른 연산과 함께 사용시]
		int num4=10;
		//int result= num4 + num3++;//후위연산자(연산후에 자신을 1증가시킴)
		int result= num4 + ++num3; //전위연산자(자신을 1증가시킨 후에 연산을 수행)
		System.out.printf("result:%d%n", result);
		System.out.printf("num3:%d%n", num3);
		
		int num5=10;
		System.out.println(num5++); //단독으로 사용된게 아니다.
		System.out.println(num5);
	}
}
