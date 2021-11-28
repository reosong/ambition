package data.test;

import java.sql.*;
import java.util.*;

public class MemberDAO {
	private static final String driver ="oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "system";
	private static final String pw = "oracle";
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	
	
	
	//public ArrayList<MemberVO> list(){
	//public ArrayList<MemberVO>list(String _name){
	public ArrayList<MemberVO> list(MemberVO vo){
		String _name =null;
		int _age = 0;
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		_name= vo.getName();
		_age = vo.getAge();
		
		try {
			connDB();
			String query = "select * from Member";
			if(_name != null && _age!=0) {
				query +=" where name ='"+_name+"' and age = "+_age;
			}else if(_name != null && _age == 0) {
				query +=" where name ='" + _name+"'";
			}else if(_name ==null && _age!=0) {
				query +=" where age = "+_age;
			}
			/*if(_name != null) {
				query += " where name='"+_name+"'";
			}*/	
			
			System.out.println(query);
			ResultSet rs = stmt.executeQuery(query);
			
			
			while(rs.next()) {
				String num = rs.getString("num");
				String name = rs.getNString("name");
				int t = rs.getInt("t");
				int w = rs.getInt("w");
				int age = rs.getInt("age");
				
				MemberVO data = new MemberVO();
				data.setNum(num);
				data.setName(name);
				data.setT(t);
				data.setW(w);
				data.setAge(age);
				
				list.add(data);
				
				
			}
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
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
	
	
	
	
	
	
	
	

}
