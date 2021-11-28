package data;

import java.sql.*;

public class SSS {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "oracle";
		Connection con = null;
		
		try {
			Class.forName(driver);
			System.out.println("ok1");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("ok2");
		} catch (ClassNotFoundException e) {
			System.out.println("no3");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(con);
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
