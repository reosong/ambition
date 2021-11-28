package generic_12.Vector;
import java.util.ArrayList;
import java.util.Scanner;



public class ArrayListEx {
	public static void main(String[] arg) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i =0; i<4;i++) {
			System.out.println("입력하시오 ");
			a.add(scanner.next());
		}
		scanner.close();
		
		String longSize = null;
		
		for(int i = 0;i<3;i++) {
			longSize= (a.get(i).length()>a.get(i+1).length())?a.get(i):a.get(i+1);
		}
		System.out.println(longSize);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
