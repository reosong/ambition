package testtttt.alone2;
class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum= studentNum;
		
	}
	
	public String toString() {
		return studentNum+ studentName;
		
	}	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu = (Student)obj;
			if(stu.studentNum ==studentNum) {
				return true;
			}else return false;
		}return false;
	}
	
	@Override 
	public int hashCode() {
		return studentNum;
	}
	
}
public class EqualsTest {

	public static void main(String[] args) {
		
		Student stu1 = new Student(1004,"송영서");
		Student stu2 = stu1;
		Student stu3 = new Student(1004,"송영서");
		
		
		System.out.println(stu1==stu2);
		System.out.println(stu1==stu3);
		
		System.out.println("=================================");
		
		System.out.println(stu1.equals(stu2));
		System.out.println(stu1.equals(stu3));
		
		
		System.out.println("=================================");
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		
		System.out.println("=================================");
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
		System.out.println(stu3.hashCode());
		
		System.out.println(System.identityHashCode(stu1));
		System.out.println(System.identityHashCode(stu2));
		System.out.println(System.identityHashCode(stu3));
		
		
		
	}

}
