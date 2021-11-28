package testtttt;

import java.util.Scanner;

public class Ex16 {


	public static void main(String[] args) {
	

	String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
	int score[] = {95,88,76,62,55};
	
	String newInt[] = new String[5];
	

	Scanner scanner = new Scanner(System.in);
	
	boolean run = true;
	
	while(run) {
	System.out.println("과목을 입력하세요 ");	
	String a = scanner.next();
	int i =0;
	
	if(a.equals("Java")) {
	System.out.println(score[0]);
	}
		
	else if (a.equals("C++")) {
		i= 1;
		System.out.println(score[i]);
	}	
	else if (a.equals(course[2])) {
		i= 2;
		System.out.println(score[i]);
		
	}
	else if (a.equals(course[3])) {
		i= 3;
		System.out.println(score[i]);
	}
	
	else if (a.equals("그만"))	{
		System.out.println("종료! ");
	 run=false;}
	}
	
		
	}

}
