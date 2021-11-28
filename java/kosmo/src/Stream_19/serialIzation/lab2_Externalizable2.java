package Stream_19.serialIzation;

import java.io.*;

public class lab2_Externalizable2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		

		FileInputStream fis = new FileInputStream("User\\ys\\animal.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Animal a = (Animal) ois.readObject();
		Animal b = (Animal) ois.readObject();
		Animal c = (Animal) ois.readObject();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		
	}

}
