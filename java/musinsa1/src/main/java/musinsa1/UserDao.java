package musinsa1;

import java.sql.*;

public class UserDao {
	
	Connection con ;
	PreparedStatement stmt;
	ResultSet rs;
	
	//기본 생성자 생성과 동시에 db와 연결 
	public UserDao() {
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
	
	public int join(User user) {
		try {
			String sql = "insert into users(id,password,email) VALUES(?,?,?)";
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, user.getUserID());
			stmt.setString(2, user.getUserPassword());
			stmt.setString(3, user.getUserEmail());
		
			return stmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1; // 디비 오류 
		
	}

	
	//아이디 중복확인 
	public int idCheck(User user) {
		try {
			String sql = "select * from users where id = ?";
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1,user.getUserID());
			rs = stmt.executeQuery();
			
			if(rs.next()) {
					
			}return -1;
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	//로그인 할때 비밀번호가 맞나 검사 
	public int login(String userID, String userPassword) {
		String sql = "select password from users where id = ?";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, userID);
			
			rs = stmt.executeQuery();
			if(rs.next()) {
				if(rs.getString(1).equals(userPassword)) {
					return 1;
				}else {
					return 0;
				}
				
			}return -1;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return -2;
		
	}
	
	
	
	
	
}
