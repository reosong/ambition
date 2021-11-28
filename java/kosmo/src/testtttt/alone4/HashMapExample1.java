package testtttt.alone4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("a", 1);
		map.put("b", 5);
		map.put("c", 4);
		map.put("d", 3);
		map.put("c", 2);
		
		System.out.println(map.size());
		
		System.out.println(map.get("a"));
		
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
		Integer value= map.get(key);
		System.out.println(key+ value);
		}
		System.out.println();
		
		map.remove("a");
		
	
		
		
		
		
		
	}

}
