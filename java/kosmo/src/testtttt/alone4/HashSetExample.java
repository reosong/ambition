package testtttt.alone4;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetExample {

	public static void main(String[] args) {
		

		Set<String> set =new HashSet<String>();
		
		set.add("java");
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		
		
		int size = set.size();
		
		System.out.println(size);
		
		
		Iterator <String> it = set.iterator();
		
		while(it.hasNext()) {
			String elements = it.next();
			System.out.println("\t"+ elements);
			
		}
		
		set.remove("b");
		set.remove("c");
		
		
		it = set.iterator();
		while(it.hasNext()) {
			String elements = it.next();
			System.out.println(elements);
		}
		
		
		set.clear();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
