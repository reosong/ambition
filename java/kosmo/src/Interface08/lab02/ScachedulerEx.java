package Interface08.lab02;

import java.io.IOException;

public class ScachedulerEx {

	public static void main(String[] args) throws IOException {
		

		System.out.println("전화상담 할당 방식을 선택하세요 ");
		System.out.println("R : 한명씩차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P : 우선 순위가 가장 높은 고객에게 할당");
		
		int ch = System.in.read();		//예외처리가 필요함.
		Scheduler scheduler = null;
		
		if(ch =='R'||ch == 'r') {
			scheduler = new RoundRobin();
		}else if(ch =='L'||ch == 'l') {
			scheduler = new LeastJob();
		}else if (ch =='P'|| ch=='p') {
			scheduler = new PriotityAllocation();
		}else {
			System.out.println("지원하지는 기능입니다.");
			return;
		}
		scheduler.getNextCall(); 
		scheduler.sendCallToAgent();
		
		
		
		
		
		
		
	}

}
