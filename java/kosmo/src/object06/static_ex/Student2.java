package object06.static_ex;

public class Student2 {

	public static int serialNum = 1000;	

	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	

	public String getStudentName() {
	return studentName;
	}
	public void setStudentName(String stuendtName) {
		this.studentName = studentName; 
	}
	public static int getSerialNum() {
		int i = 10;
	return serialNum;
	}
	public static void setSerialNum(int serialNum) {
	Student.serialNum = serialNum;
	}

	
	
	
	
}
