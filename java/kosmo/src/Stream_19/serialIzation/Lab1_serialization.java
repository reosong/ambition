package Stream_19.serialIzation;

import java.io.*;

class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3085264524617727760L;
	//직열화 :객체 (인스턴스) 를 파일에저장
	// 1.serializable간단한 컨트롤로 직열화
	//externalizable '세부적인 컨트롤이 가능하면서 직열화(메소드제공) 
	
	String name;
	transient int id;
	transient String phoneNumber;
	String email;
	
	public Student() {}
	
	public Student(String name,int id, String phoneNumber, String email) {
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public String toString() {
		return name+" "+id+" " +phoneNumber+" " +email;
	}
	
	
}

public class Lab1_serialization {

	public static void main(String[] args) throws IOException {
		

		Student s1= new Student("song",111,"12345","song@");
		Student s2= new Student("kim",112,"12333","kim@");
		Student s3= new Student("park",113,"12444","park@");
		
		FileOutputStream fis = new FileOutputStream("Users/ys/student.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.writeObject(s3);
		
		System.out.println("성공띠!");
		
		
	}

}
