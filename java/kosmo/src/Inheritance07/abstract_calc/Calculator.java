package Inheritance07.abstract_calc;

public abstract class  Calculator {		//추상클래스 : 프로젝트 설계자가구현부는 없이 메소드를 선언만 해둠
	
	
	
	public abstract int add(int a, int b);
	public abstract int substract(int a, int b);
	public abstract double average(int[] a);

	public abstract int times (int[] b);		//배열을 인풋받아 모두 더하고 정수값으로 리턴해준다
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
