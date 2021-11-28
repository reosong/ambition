package testtttt.aloneJava;
import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException  {
		
		
		System.out.println("정렬방식을 선택하세요 ");
		System.out.println("B");
		System.out.println("H");
		System.out.println("Q");
		
		
		int ch = System.in.read();
		Sort sort = null;
		if(ch =='b') {
			sort = new Bu();
		}
		
		
		int arr[] = new int[10];
		sort.as(arr);
		sort.de(arr);
		sort.aa();
		
		
		
		
		
		
		
		
		
		
	}

}
