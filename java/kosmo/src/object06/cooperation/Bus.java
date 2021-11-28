package object06.cooperation;

public class Bus {

	int busNumber;   // 버스 번호 
	int passengerCount;  // 승객 수 
	int money;           //수입 
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take (int money) {		//버스의 수입 및 승객수를 처리하는 매소
		this.money += money;		//this.money = this.money + money
									// 기존의 버스 수입에서 머니를 추가해서 다시 메모리에 저장 
		passengerCount++;			// 승객 수를 증가 
	}
	
	public void showinfo() {
		System.out.println("버스 "+ busNumber + "번의 승객은 "
	+ passengerCount + "명이고 , 수입은: "+money +"입니다 ");
		
	}
	
	
	
}
