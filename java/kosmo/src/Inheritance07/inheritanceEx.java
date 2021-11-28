package Inheritance07;

public class inheritanceEx {

	public static void main(String[] args) {
	

		Student s =new Student ();
		s.set();		//sub class 의 set() 메소드실행, 부모클래스의 필드에 값을 할당. 
		
		
		System.out.println(s.age);		//super class 의 나의를 출력 
		System.out.println(s.name);		//super class 의 이름을 출력 
		System.out.println(s.height);	//super class 의 키를 출력 
		System.out.println(s.getWeight());	//super class 의 몸무게를 출력 
		System.out.println();
		
		
		
		

	}

}
