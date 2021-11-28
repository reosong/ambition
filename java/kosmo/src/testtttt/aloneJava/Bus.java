package testtttt.aloneJava;

public class Bus {
	
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus (int busNumber) {
		this.busNumber= busNumber;
		
	}
	
	public void take(int money) {
		this.money += 1000;
		passengerCount ++;
		
	}
	
	public void showInfo() {
		System.out.println(busNumber + "번돈은 "+money + "승객 수는 "+ passengerCount);
		
	}
	
	
	
	
	
	
	
	
	

}
