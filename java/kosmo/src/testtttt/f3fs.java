package testtttt;

import java.util.Scanner;

public class f3fs {

	

	

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		
		if(a>b) System.out.println(">");
		else if (a<b) System.out.println("<");
		else System.out.println("==");
	
	}

}
