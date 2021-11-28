package testtttt.alone2;

import java.util.LinkedList;

public class LinkedListTest {
	

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		
		li.add("a");
		li.add("b");
		li.add("c");
		
		System.out.println(li.toString());
		
		
		
		li.add(1, "abc");
		
		System.out.println(li);
		
		li.add(0,"o");
		
		
		System.out.println(li);
		li.remove(3);
		System.out.println(li);
	}

}
