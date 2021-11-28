package Basic_class_11.object;

import doit.array.Student;
import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		

		Student s1 = new Student(1,"홍길동");
		Student s2 = new Student(1,"홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode());
	}
		static class Student{
			int sno;
			String name;
			Student(int sno, String name){
				this.sno = sno;
				this.name= name;
				
			}
		
			@Override
			public int hashCode() {
				return Objects.hash(sno,name);
			}
		


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st = (Student) obj;
			if(this.sno==st.sno&& this.name== st.name) {
				return true;
			}else return false;
				
		}
		return false;
	}}
}