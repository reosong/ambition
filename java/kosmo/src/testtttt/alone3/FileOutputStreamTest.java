package testtttt.alone3;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		FileOutputStream fos = new FileOutputStream("output.txt",true);
		try (fos){
			byte[] bs =new byte[26];
			byte data =65;
			for(int i =0; i<bs.length;i++) {
				bs[i]= data;
				data++;
				
			}
			fos.write(bs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
