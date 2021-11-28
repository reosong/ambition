package testtttt;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//System.out.println("컴퓨터와 가위바위보를 합니다. ");
		
		//String a = scanner.next();
	///	int n = (int)(Math.random()*3);
		//int i;
		boolean run = true;
		//가위 1 바위 2 보 3 
		while(run) {
			System.out.println("컴퓨터와 가위바위보를 합니다. ");
			
			String a = scanner.next();
			int n = (int)(Math.random()*3);
			int i;
		if(a.equals("가위")) {
			i =1; 
			if (n==1) {
				System.out.println("비겼습니다.");
				
			}else if (n==2) {
				System.out.println("컴퓨터가 이겼습니다.");
				
			}else if (n==3) {
				System.out.println("사용자가 이겼습니다 ");
		
		}
		}
		else if(a.equals("바위")) {
			i =2; 
			if (n==1) 
				System.out.println("사용자가 이겼습니다. ");
			else if (n==2)
				System.out.println("비겼습니다. ");
			else if (n==3)
				System.out.println("컴퓨터가 이겻습니다.  "); 
				
			
		}
		
		else if(a.equals("보")) {
			i =3; 
			if (n==1) 
				System.out.println("컴퓨터가 이겼습니");
			else if (n==2)
				System.out.println("사용자가 이겼습니다.  ");
			else if (n==3)
				System.out.println("비겼습니다."); 
				
		} 
		
		else if(a.equals("그만")) {
			System.out.println("시스템을 종료합니다. ");
			run= false;
		}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
