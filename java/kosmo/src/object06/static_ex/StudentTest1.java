package object06.static_ex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이자바");
		System.out.println(studentLee.serialNum);
		//객체 생성후 static 맴버 호출 
		studentLee.serialNum ++;
		
		Student studentKim = new Student();
		studentKim.setStudentName("김자바 ");
		System.out.println(studentKim.serialNum);
		studentKim.serialNum++;		
		
		
		System.out.println();
		
		System.out.println(Student.serialNum);
		//객체 생성 없이 static맴버 호출,클래스 이름. 으로 바로 호출 가능 
		Student.serialNum++;		//클래스 이름으로 증가 
		System.out.println();
		
		System.out.println(Student.getSerialNum());
		
		
		
		
	}

}
