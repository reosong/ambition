package Stream_19.decorator;

import java.io.*;

public class BufferedStreamTest {
	public static void main(String[] arg) throws IOException {
		//BufferedStream :보조 스트림 ram사용 8kb 처리
		
		FileInputStream fis = new FileInputStream("D:\\Temp\\a.exe");
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\c.exe");
		
		BufferedInputStream bis = new BufferedInputStream(fis); //보조스트림
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		
		int i;
		while((i=bis.read())!=-1) {//8kb 씩 읽어들임;
			bos.write(i);
			
		}
		
		
		
		
		
		
	}

}
