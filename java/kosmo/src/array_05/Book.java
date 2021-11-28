package array_05;

public class Book {

	private String bookName;		//책이름 
	private String author;			//저자  필드 
	
	
	
	
	
	
	public Book() {}				//생성자 
	
	public Book(String bookName, String author) {//input값 2개를 받는 생성자 
		this.bookName= bookName;
		this.author = author;
	}

	
	
	public String getBookName() {		//메소드 
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public void showInfo() {
		System.out.println(bookName + ", "+ author);
	}
	
	
	
	
	
	
}
