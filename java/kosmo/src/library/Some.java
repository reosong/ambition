package library;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Some {
	private static String driverName = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String dbuid = "hr";
	private static String dbpwd = "1234";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	         
	Class.forName(driverName);
	          Connection conn = DriverManager.getConnection(url,dbuid,dbpwd);
	          Statement stmt = conn.createStatement();
	          String sql = "SELECT * FROM EMPLOYEES";
	          ResultSet rs = stmt.executeQuery(sql);

	while(rs.next()) {
	          System.out.print(rs.getInt("Employee_ID")+ " ");
	          System.out.print(rs.getString("FIRST_NAME") +" ");
	          System.out.println(rs.getString("LAST_NAME"));

	}

	rs.close();
	stmt.close();
	conn.close();
	
	}

}
