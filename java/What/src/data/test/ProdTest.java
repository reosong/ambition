package data.test;
import java.util.*;

public class ProdTest {

	public static void main(String[] args) {
		ProdVo vo = new ProdVo("가나다 ","eee","rere",10);
		ProdDao dao = new ProdDao();
		
		dao.addProdInfo(vo);
		
		ArrayList<ProdVo> list = dao.list(vo);
		
		for(int i =0;i<list.size();i++) {
			ProdVo data = (ProdVo) list.get(i);
			String code = data.getProdCode();
			String name = data.getProdName();
			String color = data.getProdColor();
			int qty = data.getProdQty();
			System.out.println(color+" "+code+" "+ name+ " "+ qty);
		}
		
		
	}

}
