package musinsa1;

import java.sql.*;
import java.util.*;

public class DataDao {

	Connection con ;
	//PreparedStatement stmt;
	ResultSet rs;
	
	//기본 생성자 생성과 동시에 db와 연결 
	public DataDao() {
		try {
		String url ="jdbc:mysql://localhost:3306/bbs";
		String id ="root";
		String pw ="1234";
		Class.forName("com.mysql.jdbc.Driver");
		
		//url id pw 값을 이용해 db에 연결 
		con = DriverManager.getConnection(url,id,pw);
		}catch(Exception e){
			e.printStackTrace();	
		}	
	}
	
	//날자를 sql에서 가져오는 메소드 
	public String getDate() {
		String sql = "select now()";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	//count 다음의 숫자를 가져온다 
	public int getNext(){
		String sql = "select count from costomer order by count desc";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			if(rs.next()) {
				return rs.getInt(1) + 1;
			}
			return 1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return -1;
	}
	
	
	public int update(String dataTitle, String dataContent, String userID) {
		
		try{
			String sql = "insert into costomer values(?,?,?,?,?,?)";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, getNext());
		stmt.setString(2,userID);
		stmt.setString(3,dataTitle);
		stmt.setString(4, dataContent);
		stmt.setString(5, getDate());
		stmt.setInt(6, 1);
		
		int result = stmt.executeUpdate();
		System.out.println(result);
		return result;
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return -1;
	}
	
	public ArrayList<Data> show() {
		ArrayList<Data> arr = new ArrayList<Data>();
		try {
			String sql = "select count,title,id,date from costomer order by count desc";
			PreparedStatement stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			
			
			while(rs.next()) {
				Data data = new Data();
				data.setDataCount(rs.getInt(1));
				data.setDataTitle(rs.getString(2));
				data.setDataID(rs.getString(3));
				data.setDataDate(rs.getString(4));
				arr.add(data);
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return arr;
	}
	
	
	
}
