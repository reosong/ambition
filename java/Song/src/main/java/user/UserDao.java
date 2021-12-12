package user;

import java.sql.*;

public class UserDao {
	
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDao() {
		try {
			String url = "jdbc:mysql://localhost:3306/bbs";
			String id = "root";
			String password = "1234";
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,id,password);
			System.out.println("성공 ");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public int login(String userID, String userPassword) { //로그인하는 내용을 디비로 보냄 
		String sql = "select userPassword from user where userID = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userID);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString(1).equals(userPassword))
					return 1;
				else
					return 0;
		 	}
			return -1;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -2;
	}

	public int join(User user) { // 회원가입 후 디비에 저장하는 메소드 
		String sql = "INSERT INTO USER VALUES(?,?,?,?,?);";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUserID());
			pstmt.setString(2, user.getUserPassword());	
			pstmt.setString(3, user.getUserName());
			pstmt.setString(4, user.getUserGender());
			pstmt.setString(5, user.getUserEmail());
			
			return pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1; //데이터베이스 오류 
	}
	
	
	
}
