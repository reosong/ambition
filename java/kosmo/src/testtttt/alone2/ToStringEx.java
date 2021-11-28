package testtttt.alone2;

class Book{
	
	String bookName;
	int bookNumber;
	
	Book(int bookNumber, String bookName){
		this.bookName = bookName;
		this.bookNumber= bookNumber;
	}
	
	@Override
	public String toString() {
		return bookName + bookNumber;
	}
	
	
}

public class ToStringEx {

	public static void main(String[] args) {
		
		
		Book book = new Book(1004,"개미 ");
		
		System.out.println(book);
		
		
	}

}
