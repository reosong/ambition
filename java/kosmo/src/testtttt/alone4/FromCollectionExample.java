package testtttt.alone4;
import java.util.*;
import java.util.Stream;

import doit.array.*;

public class FromCollectionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("g",10),
				new Student("h",20),
				new Student("k",30));
		
		
		Stream<Student> stream = studentList.stream();
		stream.forEach(s->System.out.println(s.getName()));
		
		
		
		
		
		
	}

}
