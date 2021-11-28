package Inheritance07.lab10;

import Inheritance07.Person;
import object06.cooperation.Student;

public class DowncastingEx {

	public static void main(String[] args) {
		
		Person p =new Student("홍길동 ");
		//업  캐스팅 : 부모 클래스의 필드, 매소드 접근 단, 오버라이딩된 메소드 호출시 동적바인딩 적용
		
		
	
		
		p.id = "1000";
		System.out.println(p.id + " , "+ p.name);		//부모클래스의 필드와 메소즈만 접근 
		
		Student s = (Student )p ; 	

		//다운 캐스팅: 부조 자식 클래스의 필드 메소드 모두 접근 || 강제로 다운캐스팅할 자료형을 명시 
		
		s.departemt = "HR";
		s.grade= "4";
		s.id = "1001";
		s.name = "김유신 ";
		
		
		
	}

}
