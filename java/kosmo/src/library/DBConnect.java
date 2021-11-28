package library;

import java.sql.*;

public class DBConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys","oracle");
			System.out.println("ok");
		}catch(SQLException e) {
			System.out.println("no");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
