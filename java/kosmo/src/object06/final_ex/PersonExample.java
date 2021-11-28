package object06.final_ex;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 =new Person("123134-2415113", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		System.out.println();
		//p1.nation= "usa";			//final 이 할당된 [상수]에는 값을 수정할수 없다. 
		//p1.ssn ="654321-1234567";
		p1.name = "을지문덕 ";			//변수 값을 할당할수 있다. 
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		
	}
	
	
}
