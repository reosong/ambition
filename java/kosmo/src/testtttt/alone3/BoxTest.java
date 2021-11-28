package testtttt.alone3;
import java.util.ArrayList;

public class BoxTest {

	public static void main(String[] args) {
		

		ArrayList<Box> ar = new ArrayList<Box>();
		
		Box b = new Box();
		
		Apple a = new Apple();
		
		
		a.setName("ap");
		a.setPrice(2000);
		
		
		b.set(a);
		System.out.println(b.get().toString());
		b.set(new Apple());
		Apple ap = (Apple) b.get();
		System.out.println(b.get());
		a.setName("aaaa");
		a.setPrice(3000);
		
		System.out.println(b.get());
		
		ar.add(b);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
