package testtttt.alone3;
import java.util.Scanner;

import java.io.IOException;

public class SystemInput {

	public static void main(String[] args) {

		System.out.println("알파벳을 입력하세요 ");
		
		int i ;
		try {
		while((i= System.in.read())!= -1) {
			System.out.println((char)i);
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("name");
		String name = sc.nextLine();
		System.out.println("age");
		int age = sc.nextInt();
		System.out.println("job");
		String job = sc.nextLine();
		
		
		System.out.println(name+ age +job);
		
		




		

	}

}
