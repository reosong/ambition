package Interface08.lab02;

public class PriotityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("고객의 등급이 높은 고객의 전화를 먼저 가져옵니다. ");		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 스킬이 높은 상담원에게 우선적으로 배분합니다. ");		
	}
	//고객등급이 높은 고객부터 대기열에서 가져와서 업무능력이 높은 상담원에게 우선으로 배분합니다.  ㅗㅛ
	

}
