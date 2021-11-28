package testtttt.alone4;

import java.util.*;


public class HashSetExample1 {

	public static void main (String[] args) {
		Set<Stu> set = new HashSet<Stu>();
		set.add(new Stu(1,"hong"));
		set.add(new Stu(2,"choi"));
		set.add(new Stu(3,"song"));
		Iterator<Stu> iter = set.iterator();
		
		
		while(iter.hasNext()) {
			Stu stu = iter.next();
			System.out.println(stu.studentNum+" "+ stu.name);
		}
	}

}
