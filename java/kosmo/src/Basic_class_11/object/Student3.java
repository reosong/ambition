package Basic_class_11.object;

public class Student3 {
int studentId;
String studentName;
int grade;
public Student3(int studentId, String studentName, int grade) {
	this.studentId = studentId;
	this.studentName = studentName;
	this.grade= grade;
	
}	
@Override
public int hashCode() {
		return studentId;
}


@Override
public boolean equals(Object obj) {
	if(obj instanceof Student3 ) {
		Student3 stu1= (Student3) obj;
		if(studentName == stu1.studentName) {
			return true;
		}else 
			return false;
	}
	return false;
		
	
}
@Override
public String toString() {

		return studentName+" " +grade;
}





public static void main(String[] arg) {

	Student3 stu = new Student3(1111,"홍길동",4);
	Student3 stu2 = new Student3(2222,"홍길동",5);




	System.out.println(stu);
	
	System.out.println(System.identityHashCode(stu));
	System.out.println(System.identityHashCode(stu2));
	System.out.println(stu == stu2);
	

	System.out.println(stu.equals(stu2));	//오버라이딩 studenName 같은때 true 
		//object equals는 객체의 주소값을 비교 
	

	System.out.println(stu.);



	
	

}

}
