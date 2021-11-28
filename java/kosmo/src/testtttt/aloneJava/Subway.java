package testtttt.aloneJava;

public class Subway {

	int subwayLine;
	int money;
	int passengerCount;
	
	
	public Subway(int subwayLine) {
		this.subwayLine= subwayLine;
		
	}
	
	public void take(int money) {
		this.money += 1500;
		passengerCount++;
		
	}
	
	
	
public void showInfo() {
	System.out.println(subwayLine + "번돈은 :"+ money + "승객수는 "+ passengerCount);
}
	
	
}
