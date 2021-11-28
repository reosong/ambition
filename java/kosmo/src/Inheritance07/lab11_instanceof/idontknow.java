package Inheritance07.lab11_instanceof;


class Person{
	
	String name;
	String id;

	public Person(String name){
		this.name = name;
	}
}

class Student extends Person{
	String grade;
	String department;

	public Student(String name){
		super(name);
	}
}

public class idontknow {

	public static void main(String[] arg) {
		
			
				Person p;
				Student s = new Student(" 송 ");
				p = s; 

				System.out.println(p.name); 
				System.out.println(s.grade);
	}
}
