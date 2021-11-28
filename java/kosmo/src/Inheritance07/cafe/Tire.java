package Inheritance07.cafe;

public class Tire {

	public int maxRotation;		//최대 회전수 
	public int accumulatedRotation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation= maxRotation;
	}
	
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation< maxRotation) {
		System.out.println(location + "tire 수명 "+ (maxRotation-accumulatedRotation)+ "회 ");
		return true;
		}else {
			System.out.println("펑크 ");
			return false;
		}
		
	}
	
	
	
	
}
