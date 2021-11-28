package Interface08.lab03;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf; //ArrayList 선언 , shelf: 인스턴스 변수 
	
	
	public Shelf() {		//생성자 초기화 
		shelf = new ArrayList<String>();
	}
	public ArrayList<String> getShelf(){
		return shelf;			//getter :shelf 
		
	}
	public int getCount() {
		return shelf.size();			//ArrayList의 방의 갯수 
	}
	
}
