package musinsa;

import java.sql.*;

public class UserDao {
	
	Connection con ;
	Statement stmt;
	ResultSet rs;
	
	//기본 생성자 생성
	public UserDao() {
		try {
		String url ="jdbc:mysql://localhost:3306/users";
		String id ="root";
		String pw ="1234";
		Class.forName("com.mysql.jdbc.Driver");
		
		//url id pw 값을 이용해 db에 연결 
		con = DriverManager.getConnection(url,id,pw);
		
		
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		
	}

	
	
	
	
	
	
	
	
}
