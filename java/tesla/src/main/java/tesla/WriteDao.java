package tesla;

import java.sql.*;
import java.util.*;

public class WriteDao {
	/*
	private int number;
	private String title;
	private String content;
	private String userID;
	private String date;
	private int ok;
	*/
	Connection con = null;
	ResultSet rs = null;
	
	
	public WriteDao() {
		try {
			String url ="jdbc:mysql://localhost:3306/tesla";
			String id ="root";
			String pw ="1234";
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,id,pw);
			}catch (Exception e) {
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
			String sql = "select number from tesladata order by number desc";
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
		
		
		
		
	//게시글을 업로드 한다 
	public int upload(String userID , String title, String content) {
		try {
		String sql= "insert into tesladata values(?,?,?,?,?,?)";
		
		
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, getNext());
		stmt.setString(2,title);
		stmt.setString(3,content);
		stmt.setString(4, userID);
		stmt.setString(5, getDate());
		stmt.setInt(6, 1);
		
		int result = stmt.executeUpdate();
		
		return result;
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return -1;
	}
	
	//게시글의 리스트를 보여준다 
	public ArrayList<Write> show() {
		ArrayList<Write> arr = new ArrayList<Write>();
		
		
		try {
			String sql = "select number, title, userID, date from tesladata where ok = 1 order by number desc";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				Write write = new Write();
				write.setNumber(rs.getInt(1));
				write.setTitle(rs.getString(2));
				write.setUserID(rs.getString(3));
				write.setDate(rs.getString(4));
				arr.add(write);
				
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		return arr;
	}
	
	public Write getWrite(int number) {
		Write write = new Write();
		try {
			String sql = "select userID, title, date, content from tesladata where number = ?";
			PreparedStatement stmt =con.prepareStatement(sql);
			stmt.setInt(1, number);
			
			rs =stmt.executeQuery();
			while(rs.next()) {
			write.setUserID(rs.getString(1));
			write.setTitle(rs.getString(2));
			write.setDate(rs.getString(3));
			write.setContent(rs.getString(4));
			}
		return write;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	return null;
	}
	
	
	public ArrayList<Write> showContent(int number){
		ArrayList<Write> arr = new ArrayList<Write>();
		try {
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return arr;
		
	}

	public Write update(int number){
		Write write = new Write();
		
		try {
			String sql = "select title, content from tesladata where number =?";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, number);
			rs =stmt.executeQuery();
			
			while(rs.next()) {
			write.setTitle(rs.getString(1));
			write.setContent(rs.getString(2));
		
			}return write;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
	
	public int correction(String title, String content, int number) {
		try {
			String sql = "update tesladata set title= ?, content = ? where number = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			System.out.println(title);
			System.out.println(content);
			System.out.println(number);
			stmt.setString(1,title);
			stmt.setString(2, content);
			stmt.setInt(3, number);
			
			int result = stmt.executeUpdate();
			
			return result;
		}catch(Exception e) {
		e.printStackTrace();
	}
		return 0;
	}
	
	public String confirm(int number) {
		try {
			String sql = "select userID from tesladata where number =? ";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, number);
			
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				String result = rs.getString(1);
				
				return result;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}
	
	public int delete(int number) {
		try {
			String sql = "update tesladata set ok = 0 where number = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, number);
			
			
			return stmt.executeUpdate();	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return -1;
	}
	
	
	
	
	
	
	
}
