package Stream_19.serialIzation;

import java.io.*;

public class lab1_read {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("D:\\Temp.student.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student st1 = (Student) ois.readObject();
		Student st2 = (Student) ois.readObject();
		Student st3 = (Student) ois.readObject();
		
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
	}

}
