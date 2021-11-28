package Exception_10.Ex;

import java.util.Scanner;

public class CompleteCalc  extends Calculator implements Clac2 {
	int a,b,c;
	public CompleteCalc(int a, int b) {
		this.a = a;
		this.b = b;
		
	}

	@Override
	public int add(int a, int b) {
		
		
		return a+b;
		
	}

	@Override
	public int times(int a, int b) {
	

		return a*b;
	}

	@Override
	int substract(int a, int b) {
	
		return a-b;
	}

	@Override
	int divide(int a, int b) {
		try {
		int c= 	a/b;
		}catch(ArithmeticException e) {
			System.out.println("b가 0입니다. ");
		}
		System.out.println(c);
		return c;
	}
	
	
	
	
	@Override
	public String toString() {
		
		return "합은" +add(a,b)+ "곱하기"+times(a,b)+
				"빼기 "+substract(a,b)+"나누기"+divide(a,b);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		CompleteCalc com =new CompleteCalc(a,b);
		System.out.println();
		
		System.out.println(com);
		System.out.println(com.add(a, b));
		System.out.println(com.times(a, b));
	}
		
}
