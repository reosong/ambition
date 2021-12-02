package data.test;
import java.util.*;

public class EmpTest {

	public static void main(String[] args) {
		
		EmpVo vo = new EmpVo();
		EmpDao dao = new EmpDao();
		
		
		ArrayList<EmpVo> list = dao.list(vo);
		

		for(int i =0; i<list.size(); i++) {
			EmpVo data = (EmpVo) list.get(i);
			int eno = data.getEno();
			String ename = data.getEname();
			String job = data.getJob();
		
			System.out.println(eno +"  " +ename+"  "+ job  );
			
			testservlet t = new testsetvlet();
			
			
			
			
			
		}
		
		
		
		
	}

}
