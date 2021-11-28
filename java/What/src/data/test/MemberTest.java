package data.test;
import java.util.*;

public class MemberTest {
	public static void main(String[] args) {
	//String _name= null;
	//_name ="송영서";
	MemberVO vo = new MemberVO("송영서",0);
	MemberDAO dao = new MemberDAO();
	ArrayList<MemberVO> list =dao.list(vo);
	
	System.out.println("num  name  t  w  age");
	for(int i = 0; i<list.size();i++) {
		MemberVO data =(MemberVO) list.get(i);
		String num = data.getNum();
		String name = data.getName();
		int t = data.getT();
		int w = data.getW();
		int age = data.getAge();
		System.out.println(num+"  "+ name+ "  "+t+ "  "+w+ "  "+age);
	}
	

}
}