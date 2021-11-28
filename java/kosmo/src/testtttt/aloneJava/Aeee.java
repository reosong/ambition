package testtttt.aloneJava;
import java.util.ArrayList;

public class Aeee {

	public static void main(String[] args) {
		
		ArrayList<Abc> arr= new ArrayList<>(10);

	
	
		Abc a = new Abc(28,"song");
		Abc b = new Abc(28,"kim");
		Abc c = new Abc(28,"kong");
		
		arr.add(a);
		arr.add(b);
		arr.add(c);
		
		for(int i =0;i<arr.size();i++) {
		arr.get(i).showInfo();
		}
		
		
		
		
		
		
		
		
		
	}

}
