package Basic_class_11.object.cloneEx;
import java.util.ArrayList;	

class MyBook implements Cloneable {
	String title;
	public MyBook(String title) {
		this.title = title;
	}
	
	public void setTitle(String title) {
		this.title= title;
	}
	
	@Override
	public String toString() {
		return title;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		

		return super.clone();
	}
	
	
	
	
}
public class ObjectArrayClone {

	public static void main(String[] args) {
		

		ArrayList<MyBook> bookList = new ArrayList<MyBook>();
		
		MyBook book1 = new MyBook("java");
		MyBook book2 = new MyBook("android");
		MyBook book3 = new MyBook("python");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		ArrayList<MyBook> copyList = (ArrayList) bookList.clone();
		
		copyList.add(new MyBook("C++"));
		
		
		for(MyBook t : bookList) {
			System.out.println(t);
		}
		System.out.println();
		for(MyBook t : copyList) {
			System.out.println(t);
		}
		
		book3.setTitle("c언어");		//ArrayList의 객체 주소가 저장됨 
		System.out.println(bookList);
		System.out.println(copyList);
		
		
	}

}
