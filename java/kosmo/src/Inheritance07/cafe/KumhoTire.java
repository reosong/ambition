package Inheritance07.cafe;

public class KumhoTire extends Tire {
	public KumhoTire(String location,int maxRotation) {
		super(location, maxRotation);
	}
@Override
public boolean roll() {
	++accumulatedRotation;

	if(accumulatedRotation < maxRotation) {
		System.out.println(location +"KumhoTIre 수명 "+
	(maxRotation-accumulatedRotation)+"회 ");
		return true;
	}else {
		System.out.println("*** "+location + "KumhoTire펑크 ***");
		return false;
	}
}
	
	
	
	
	
}
