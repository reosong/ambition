package Interface08.lab05;

public class DriverExample {

	public static void main(String[] args) {
		
Driver driver = new Driver();

Bus bus = new Bus();
Taxi taxi = new Taxi();


driver.derive(taxi);
driver.derive(bus);
	}

}
