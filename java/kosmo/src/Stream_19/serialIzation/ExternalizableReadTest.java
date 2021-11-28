package Stream_19.serialIzation;

import java.io.*;

public class ExternalizableReadTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("Users\\ys\\dog.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog cuteReo= (Dog) ois.readObject();
		Dog yourDog = (Dog) ois.readObject();
		

		System.out.println(cuteReo);
		System.out.println(yourDog);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
