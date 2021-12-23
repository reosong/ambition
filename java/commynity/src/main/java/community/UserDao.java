package community;

import java.sql.*;

public class UserDao {

	
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement stmt = null;
	
	public UserDao(){
		try {
		String url ="jdbc:mysql://localhost:3306/commnunity";
		String id ="root";
		String pw ="1234";
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url,id,pw);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int insertDB(User user) {
		
		try {
			String sql = "insert into member values(?,?,?,?,?,?,?,?)";
			
			stmt= con.prepareStatement(sql);
			
			stmt.setString(1, user.getUserid());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getUsername());
			stmt.setString(4, user.getEmail());
			stmt.setString(4, user.getZipcode1()+user.getZipcode2());
			stmt.setString(5, user.getAddress1());
			stmt.setString(6, user.getAddress2());
			stmt.setString(7, user.getPhone1()+user.getPhone2()+user.getPhone3());
			
			int result = stmt.executeUpdate();
			
			return result;
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		return 0;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
