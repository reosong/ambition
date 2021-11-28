package generic_12.Vector;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		

		HashMap <String, Integer> javaScore = new HashMap<String,Integer>();
		Scanner  sc = new Scanner(System.in);
		
		javaScore.put("reo", 100);
		javaScore.put("song", 100);
		javaScore.put("james", 80);
		javaScore.put("jane", 70);
		javaScore.put("scalret", 100);
		
		
		System.out.println(javaScore.size());
		
		
		
		Set<String> keys = javaScore.keySet();
		
		
		//key 문자열을 순서대로 접근하는 iterator 리턴 
		Iterator <String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name+" "+ score);
			
		}
		
		
		
		for(int i =0;i<javaScore.size();i++) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
