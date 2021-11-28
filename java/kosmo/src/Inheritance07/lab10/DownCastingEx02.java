package Inheritance07.lab10;

import Inheritance07.Person;
import Inheritance07.Student;

public class DownCastingEx02 {

	public static void main(String[] args) {


		Student s ;		//객체 변수 (인스턴스 변수) 선언 
		Person p;		//객체 변수 (인스턴스 변수) 선언 
		
		
		
		s = new Student ("홍길동 ");		//객체 생성 
		s.
		p = s; //업캐스팅 
		
		p.id = "2000"; p.name= "김자바";
		System.out.println("다운 캐스팅 -----------------");
		
		s = (Studennt )p;
		s.id = "3000"; s.name = "홍자바 ";s.grade = "4"; s.department = "saled";
		
		System.out.println(s.fly());//오버라이딩된 메소드 
		
		
	
		
		
		
		
		
		
		
	}

}
