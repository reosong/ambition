package data.test;

import java.sql.*;
import java.util.*;


public class EmpDao {
	private static final String driver ="oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "system";
	private static final String pw = "oracle";
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	
	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("driver ok");
			conn= DriverManager.getConnection(url,user,pw);
			System.out.println("connection ok");
			stmt= conn.createStatement();
			System.out.println("statement ok");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<EmpVo> list(EmpVo em){
		int _eno=0;
		String _ename=null;
		String _job = null;
		
	
		
		ArrayList<EmpVo> list = new ArrayList<EmpVo>();
		_eno = em.getEno();
		_ename = em.getEname();
		_job = em.getJob();
		
		try {
			connDB();
			String query = "select * from emp ";
			if(_ename != null && _eno != 0 && _job != null) {
				query += " where ename ='"+ _ename +"' and eno ="+ _eno+ 
				"and job '"+ _job+ "'";
			}
			System.out.println(query);
			System.out.println("===================================");
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				int eno = rs.getInt("eno");
				String ename = rs.getString("ename");
				String job= rs.getString("job");
			
				
				EmpVo data = new EmpVo();
				data.setEno(eno);
				data.setEname(ename);
				data.setJob(job);
			
				list.add(data);
				
				
				
				
			}
			rs.close();
			stmt.close();
			conn.close();
			
			
			
		}catch(Exception e) {
			e.getStackTrace();
			
		}
				
		return list;
		
		
	}

	
	
	
	

}
