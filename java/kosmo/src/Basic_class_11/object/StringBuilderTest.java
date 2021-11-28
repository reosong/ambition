package Basic_class_11.object;

public class StringBuilderTest {		//단일쓰레드환경에서 대량으로 문자열연결할때 사용
	

	public static void main(String[] args) {
		String javaStr = new String ("Java");
		
		System.out.println("JavaStr 문자열 주소 : "+ System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산전 buffer 메모리 주소 : "+ System.identityHashCode(buffer));
		
		buffer.append(" and" );
		buffer.append(" android");
		buffer.append(" program is fun");
		
		System.out.println("연산후 buffer 메모리 주소 : "+System.identityHashCode(buffer)
		);
		
		
		javaStr = buffer.toString();		//buffer의 문자열연결한 값을 javaStr 에할당 
		
		System.out.println(javaStr);
		System.out.println("연결된 javaStr 문자열 주소 : "+ System.identityHashCode(javaStr)
		);
	
	
	
	}

}
