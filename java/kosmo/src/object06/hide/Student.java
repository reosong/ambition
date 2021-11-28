package object06.hide;

public class Student {
	int studentID;			//학생 학번 
	private String studentName;		//학생 이름  private 정보의은닉) setter 를 사용 해서 외부에서 값을 할당.
	int greade;			//학년 
	String addredd;		//주소 
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
		
			// getter : 변수의 값을 돌려줄 때 사용	하는 메소드, public
			// setter : 변수의 값을 할당할 때 사용하는 메소드 , public
	/*
	public String getStudentName() {		//getter
		return studentName;
	}

	public void setStudentName(String studentName) {		//setter
		this.studentName = studentName;
		
	}
	*/
	
	//자동으로 getter, setter 만들기 
	
	
	
	
	
}
