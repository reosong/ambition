package Stream_19.serialIzation;

import java.io.*;

class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4724464852474561328L;
	String name;
	transient String job;
	//직열화에서 직열화 되지않음
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
		
	}
	
	
	
	@Override
	public String toString() {
		return name+" "+job;
	}
}	



//직렬화: 객체자체를 파일로 저장하는 것 
//직열화의serialVersionUID 가 생성되어 잇어야한다
//serializable == maker interface(구현코드가 없는 인터페이스)



public class SerializationTest {

	public static void main(String[] args) throws IOException {
		

		
		Person personAhn = new Person("안정환","축구선수");
		Person personKim = new Person("김두환","깡패");
		
		
		FileOutputStream fos = new FileOutputStream("D:\\temp\\serial.dat");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		//객체를 파일로 짖렬화 보조스트림 
		
		
		oos.writeObject(personAhn);
		oos.writeObject(personKim);
		System.out.println("=====직열화 성공 ====");
		
		
		
	}

}
