package testtttt.alone3;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Exception_10.ArrayIndexOutOfBoundsException02;
class Person{
	private static final long serialVersionUID = -1503252436164L;
	
	String name;
	String job;
	
	public Person() {	}
	
	public Person(String name, String job) {
		this.name = name;
		this.job= job;
		
	}
	
	public String toString() {
		return name+ job;
		
	}
	
	
	
	
}
public class SerializationTest {

	public static void main(String[] args) {
		

		Person p1 = new Person("song","ceo");
		Person p2 = new Person("kim","partner");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(p1);
			oos.writeObject(p2);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileOutputStream fis = new FileOutputStream("serial.out");
				ObjectInputStream ois =new ObjectInputStream(fis)){
			Person pe1 = (Person)ois.readObject();
			Person pe2 = (Person)ois.readObject();
			
			System.out.println(pe1);
			System.out.println(pe2);
		}catch(IOException e) {
			e.printStackTrace();
			
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
