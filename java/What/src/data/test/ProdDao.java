package data.test;

import java.sql.*;
import java.util.*;

public class ProdDao {
	
	private static final String driver ="oracle.jdbc.driver.OracleDriver";
	private static final String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user= "system";
	private static final String pw = "oracle";
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	

	public void addProdInfo(ProdVo vo) {
		String code = null;
		String name = null;
		String color = null;
		int qty =0;
		
		code = vo.getProdCode();
		name = vo.getProdName();
		color = vo.getProdColor();
		qty = vo.getProdQty();
		
		try {
			connDB();
			
			String query = "insert into product(prodCode, prodName, prodColor, prodQty)"+
			"values ('"+
			code+ "','"+name+ "','"+ color+ "',"+ qty+")";
			System.out.println(query);
			stmt.executeUpdate(query);
			
		}catch(Exception e){
			e.printStackTrace();			
		}
		}
	
	
	public ArrayList<ProdVo> list(ProdVo vo){
		
		connDB();
		String query = "select * from product";
		
		
		ArrayList<ProdVo> list =new ArrayList<ProdVo>();
		
		try {
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()) {
			String code = rs.getString("prodCode");
			String name = rs.getString("prodName");
			String color = rs.getString("prodColor");
			int qty = rs.getInt("prodQty");
			
			
			ProdVo data = new ProdVo();
			data.setProdCode(code);
			data.setProdColor(color);
			data.setProdName(name);
			data.setProdQty(qty);
			
			list.add(data);
			
		}
		rs.close();
		stmt.close();
		conn.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		return list;
	}
	
	
	public void connDB() {
		try {
		Class.forName(driver);
		conn =DriverManager.getConnection(url,user,pw);
		stmt = conn.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}
