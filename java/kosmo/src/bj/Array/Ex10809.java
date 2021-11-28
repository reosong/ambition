package bj.Array;

import java.util.Scanner;

public class Ex10809 {


	public static void main(String[] args) {
		

	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	
	String[] array = s.split("");
	String a = "a";
	System.out.println(a.parsequals((char)(97)));
	for(int i=0; i<array.length;i++) {
		for(int j = 0 ; j<26;j++) {
			if(array[i].equals((char)(97+j))){
			System.out.print(j);
			break;
			}else
				System.out.print(-1);
		}
	}
	
	
	
	for(int i=0; i<array.length;i++) {
		System.out.println(array[i]);
	}
	
		
		
		
		
		
		
		
	}

}
