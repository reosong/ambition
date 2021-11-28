package Basic_class_11.class_ex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person ();
		Class pClass1 = person.getClass();//object 클래스의 getClass 메소드 사용 
		System.out.println(pClass1.getName());
	
		Class pClass2 = Person.class;//직접 class 대입 
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("Basic_class_11.class_ex.Person");
		System.out.println(pClass3.getName());//클래스 이름 가져오기 
		
	
		System.out.println(person.getClass());
	
	
	
	
	
	
	}

}
