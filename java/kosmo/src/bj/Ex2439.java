package bj;
import java.util.Scanner;
public class Ex2439 {

	public static void main(String[] args) {

	
	Scanner scanner  = new Scanner(System.in);
	
	int N = scanner.nextInt();
	scanner.close();
	for(int i =N; i>=0; i--) {
		for(int j = 0;j<N; j++) {
		if(j>=i) {
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
	}System.out.println();
		}
	
	
	
	
	
	
	}

}
