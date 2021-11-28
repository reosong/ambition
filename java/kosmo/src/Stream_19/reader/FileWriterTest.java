package Stream_19.reader;

import java.io.*;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter ("writer.txt");
		fw.write('A');
		
		char[] buf = {'b','c','d','e','f','g'};
		
		fw.write(buf);
		
		fw.write("안녕하세요");
		
		
		fw.write(buf,1,2);
		fw.write("65");
		fw.write(65);
		
		
		fw.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
