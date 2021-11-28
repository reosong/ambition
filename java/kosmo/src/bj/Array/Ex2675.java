package bj.Array;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex2675 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		
		
		
		for(int i =0; i<a;i++) {
		
		
		int r = sc.nextInt();
		
		String s = sc.next();
		
		String array[] =s.split("");
		
		ArrayList<String> newArray = new ArrayList<String>();
		
		for(int c =0; c<array.length;c++) {
		for(int j = 0 ;j <r ;j++) {
			newArray.add(array[j]);
			
			
			
		}
		
		
		}
		
		for(int in =0;;i++) {
			if(newArray[in]==null) {
				break;
			}else(newArray.get(in))
		}
		
		
		
		
		}
		
	
		
		
	}

}
