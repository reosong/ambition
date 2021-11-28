package testtttt.alone3;
import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String > sList = new ArrayList<String>();
		
		sList.add("Tomas");
		sList.add("james");
		sList.add("song");
		
		
		Stream<String> stream = sList.stream();
		
		stream.forEach(s->System.out.println(s));

		sList.stream().sorted().forEach(s->System.out.println(s));
		
		
		
		
		
		
		
		
	}

}
