package object06.static_ex;

public class StudentTest3 {

	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.studentName = "이자바 ";
		System.out.println(Student3.getSerialNum());
		System.out.println();
		
		Student3 studentKim = new Student3();
		studentKim.studentName= "김자바";
		System.out.println(Student3.getSerialNum());
		System.out.println();
		
		Student3 studentHong = new Student3();
		studentHong.studentName = "홍자바 ";
		System.out.println(Student3.getSerialNum());
		
	}

}
