package testtttt.alone3;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {


	public static void main(String[] arg) {
		
	
		
		
		FileInputStream fis =null;
		
		try {
			fis= new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
			
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}System.out.println("PLAY");
		}System.out.println("always");
		
		
		
		
		
		
		
		
	}
}
