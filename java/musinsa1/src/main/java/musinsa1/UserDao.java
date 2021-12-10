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

	
	
	
	
	
	
	
	
}
