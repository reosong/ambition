package Stream_19.decorator;

import java.io.*;

public class InputStreamReaderTest {

	public static void main(String[] args) throws IOException {
		//FileInputStream: 기반스트림 바이트 스트림(바이트를 읽기때문에 한글이 다 깨짐)
		//InputStramReader: 보조스트림 바이트스트림을 문자스트림으로 변환 
		
		System.out.println("한글이 모두 깨짐 ");
		FileInputStream fis = new FileInputStream("reader.txt");
		
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("보조스트림(inputstreamReader)을 사용해서 한글을 출력 ");
		
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("Reader.txt"));
		//보조스트림 사용법 : 생성자 내부에 기반 스트림을 포함(매가값으로 기반스트림)
		int j;
		while((j=isr.read())!=-1) {
			
			System.out.print((char)j);
			
		}
		
		
		
		
		
		
	}

}
