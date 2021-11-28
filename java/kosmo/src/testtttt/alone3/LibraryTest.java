package testtttt.alone3;
import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;

class Book{
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price= price;
		
	}
	public int getPrice() {
		return price;
	}
public String getName() {
	return name;
}
}

public class LibraryTest {

	public static void main(String[] args) {
		

		List<Book> li = new ArrayList<>();
		li.add(new Book("java",25000));
		li.add(new Book("python",30000));
		li.add(new Book("android",20000));
		
		
		Stream<Book> stream =li.stream();
		
		int total = li.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(total);
		
		
		li.stream().filter(c->c.getPrice()>=20000).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		
		
		
		
		
		
		
		
	}

}
