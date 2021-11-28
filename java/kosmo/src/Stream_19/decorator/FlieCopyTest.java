package Stream_19.decorator;

import java.io.*;

public class FlieCopyTest {

	//D:\workspace\a.exe
	public static void main(String[] args) throws IOException {
		

		FileInputStream fis =new FileInputStream("/Users/Desktop/workspace/a.exe");
		
		
		FileOutputStream fos = new FileOutputStream("/Users/song-yeongseo/workspace/a.exe");
		
		
		long millisecond = 0;
		millisecond =System.currentTimeMillis();
		
		int i ;
		int j=1;
		while((i=fis.read())!=-1) {
			fos.write(i);
			j++;
		}
		millisecond =System.currentTimeMillis();
		System.out.println("복사하는데 걸린시간 "+millisecond);
		System.out.println("총 복사한 바이트 수는 "+j );
		
		
		
	}

}
