package Exception_10.Ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ExceptionHandling01 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		

		try {
		fis = new FileInputStream("c.txt");
		}catch(FileNotFoundException e) {
			System.out.println(e);
			System.out.println("catch ");
		}
		finally {
		System.out.println("프로그램 종료");
		}
		
		
		
		
		
		
		
		
	}

}
