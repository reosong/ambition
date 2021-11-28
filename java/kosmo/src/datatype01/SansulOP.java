package operator02;

public class SansulOP {

	public static void main(String[] args) {
		/*
		 * 산술연산자(이항연산자)의 결과는 다양하다
		 * 산술연산자내 에서의 연산 우선순위
		 * (*,%,/) > (+,-)
		 * 우선 순위가 같은 경우 왼쪽에서 오른쪽으로 연산하다
		 * 산술 연산자를 써서 식을 만들면 산술식
		 */
		int num1 =3;
		int num2 =5;
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1/num2);
		System.out.println(num2/num1);
		System.out.println(num1%num2);
		
		short s=100;
		//short s2= -s;[x] -연산을 하면 정수형
		int num3 = -s;
		System.out.println(num3);
		
		short s3=++s;
		System.out.println(s3);
		
		int result = 3*2 + 5%2-6/3*5;
		System.out.println(result);
		
		double d1 =3;
		double d2 =5;
		System.out.println(d1+d2);
		System.out.println(d1-d2);
		System.out.println(d1/d2);
		System.out.println(d2/d1);
		System.out.println(d1%d2);
		
	}

}
