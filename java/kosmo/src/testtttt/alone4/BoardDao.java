package testtttt.alone4;

import java.util.*;

public class BoardDao {

public List<Board1> getBoardList() {
	List<Board1> list =new ArrayList<Board1>();
	list.add(new Board1("제목1","내용 "));
	list.add(new Board1("제목1","내용 "));
	list.add(new Board1("제목1","내용 "));
	
	return list;
}

}

