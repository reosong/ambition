package bj.Array;
import java.util.Scanner;

public class Ex11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		String[] array = new String[a];
		
		
		String b = sc.next();
		
		String[] array1 =b.split("");
		
		int sum = 0;
		for(int i = 0; i<a;i++) {
			sum+= Integer.parseInt(array1[i]);
		}
		
		System.out.println(sum);
		
		
		
		
	}

}
