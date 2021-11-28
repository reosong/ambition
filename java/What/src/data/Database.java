package data;

import java.sql.*;

public class Database {
	public static Connection dbconn;
	public static Connection getConnection() {
		Connection connect = null;
		try {
			String user = "sys";
			String pw = "oracle";
			String url="jdbc:oracle:thin:@localhost:1521:ex";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connect = DriverManager.getConnection(url,user,pw);
		}catch(ClassNotFoundException cnfe) {
			System.out.println(cnfe.toString());
		}catch(SQLException sqle) {
			System.out.println(sqle.toString());
		}catch(Exception e) {
			System.out.println("??");
			e.printStackTrace();
		}return connect;
	}
	

}
