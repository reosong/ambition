package Stream_19.serialIzation;

import java.io.*;

public class ReadSerializationTest {//파일에 저장된 객체를 읽어서 출력 

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		

		FileInputStream fis = new FileInputStream("D:\\Temp\\serial.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person p1 = (Person) ois.readObject();
		//첫번째 객체를 읽어서p1 에 할당 
		Person p2 = (Person) ois.readObject();
		//두번째 객체를 읽어서 p2에 할당 
		
		System.out.println(p1);
		System.out.println(p2);
		
		
		
		
		
		
	}

}
