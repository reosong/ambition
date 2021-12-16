package tesla;

import java.sql.*;

public class UserDao {

	Connection con = null;
	ResultSet rs = null;
	
	PreparedStatement pstmt =null;
	
	public UserDao(){
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
	
	public int join(User user) {
		
		String sql = "insert into teslauser(userID,userPassword,userEmail) VALUES(?,?,?)";
		try {
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user.getUserID());
		pstmt.setString(2, user.getUserPassword());
		pstmt.setString(3,user.getUserEmail());
		
		return pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return 0;
		
	}
	
	
	
	
	
	
	
	
}
