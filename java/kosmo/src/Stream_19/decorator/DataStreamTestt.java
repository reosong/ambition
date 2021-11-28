package Stream_19.decorator;

import java.io.*;

public class DataStreamTestt {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\data.txt");
		FileInputStream fis = new FileInputStream("D:\\Temp\\data.txt");
		
		
		DataOutputStream dos = new DataOutputStream(fos);
		DataInputStream dis = new DataInputStream(fis);
		//다양한 형식의 자료형을처리, 주의 :아웃풋
		
		dos.writeByte(100);
		dos.writeChar('A');
		dos.write(10);
		dos.writeFloat(3.14F);
		dos.writeDouble(3.14159);
		System.out.println("출력 완료<외부파일에 저장 >");
		
		
		System.out.println("인풋해서 출력 ");
		
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.read());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		
		
		
		
		
		
		
		
		
		

	}

}
