package testtttt.aloneJava;
import java.util.Random;
public class lotto {

	public static void main(String[] args) {
		

		
		System.out.println("로또 번호 추첨을 시작합니당");
		
		
		
		Random aa = new Random();
		
		for(int i =0; i<6; i++) {
			System.out.println(aa.nextInt(45)+1);
		}
		
		System.out.println);	
	}

}
