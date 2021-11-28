package doit.array;

public class Student {

	String studentId;
	String name;
	
	public Student(String studentId, String name) {
		this.studentId= studentId;
		this.name= name;
		
	}
	
	public void showInfo() {
		System.out.println(studentId + name);
		
	}
	
	
	
}
