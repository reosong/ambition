package testtttt.alone4;
import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board1> list = dao.getBoardList();
		for( Board1 board : list) {
			System.out.println(board.getTitle() +" "+ board.getContent());
		}
	}

}
