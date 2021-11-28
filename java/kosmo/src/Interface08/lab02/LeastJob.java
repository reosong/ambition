package Interface08.lab02;

public class LeastJob implements Scheduler{
	//현재 상담업무가 없거나 상담대기가 가장 작은 상담원에게 콜을 보냅니다 
	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다. ");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담업무가 없거나 상담대기가 가장 작은 상담원에게 전화콜을 할당합니다. ");
		
	}

	
	
	
	
	
	
	
	
	
}
