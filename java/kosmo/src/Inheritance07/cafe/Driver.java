package Inheritance07.cafe;

public class Driver {

	
	
	public void drive(Vehicle vehicle) {//매개변수에 Vehicle 을 상속받은 자식클래스도 올수 있음 
		vehicle.run();
	}





public int sum;

public Driver(int sum) {
	this.sum = sum;
	
};




public int getSum() {
	return sum;
}




public void setSum(int sum) {
	this.sum = sum;
}




public void sumCoast() {
	System.out.println(sum);
}
;
}