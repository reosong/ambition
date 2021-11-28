package Interface08.lab02;

import java.util.Scanner;

public class SchedulerEx02 {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("전화상담 할당 방식을 선택하세요 ");
			System.out.println("R : 한명씩차례로 할당");
			System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
			System.out.println("P : 우선 순위가 가장 높은 고객에게 할당");
			Scheduler scheduler = null;
			String ch = scanner.next();
			
			if(ch.equals("R")|| ch.equals("r")) {
				scheduler = new RoundRobin();
				scheduler.getNextCall(); 
				scheduler.sendCallToAgent();
				System.out.println("-------------------------");
				
			}else if(ch.equals("L")||ch.equals("l")) {
				scheduler = new LeastJob();
				scheduler.getNextCall(); 
				scheduler.sendCallToAgent();
				System.out.println("-------------------------");
				
				
			}else if (ch.equals("P")|| ch.equals("p")) {
				scheduler = new PriotityAllocation();
				scheduler.getNextCall(); 
				scheduler.sendCallToAgent();
				System.out.println("-------------------------");
			
			}else if(ch.equals("그만")) {
			
				System.out.println("종료합니다 ");
				run = false;
			}
			
			
		}
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
