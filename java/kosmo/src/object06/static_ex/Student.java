package object06.static_ex;

public class Student {
	
	public static int serialNum = 1000;		//static : 메모리의 stack 영역에 생성 
											//new 없이도 접근이 가능 : 객체 생성없이도접근 
											// 각각의 객체가 공유하는 메모리 영역
											//인스턴스 생성보다 먼저 생성됨.
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
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
