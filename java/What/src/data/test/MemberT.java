package data.test;

import java.sql.*;

public class MemberT {
	private static final String driver=
			"oracle.jdbc.driver.OracleDriver";
			private static final String url= 
			"jdbc:oracle:thin:@localhost:1521:xe";
			private static final String user="system";
			private static final String pw= "oracle";

	public static void main(String[] args) {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	try {
		Class.forName(driver);
		System.out.println("oracle 드라이버 로딩 성공 ");
		conn= DriverManager.getConnection(url,user,pw);
		System.out.println("statment 생성 성공 ");
		
		stmt = conn.createStatement();
		System.out.println("statment ok");
		String query = "insert into Member values('1234','송영서',175,73,28)";
		System.out.println(query);
		stmt.executeUpdate(query);
		
		String query2 = "select * from Member";
		System.out.println(query2);
		rs= stmt.executeQuery(query2);
		
		while(rs.next()) {
			System.out.println("id"+rs.getString("num"));
			System.out.println("이름 "+rs.getString("name"));
			System.out.println("키 "+rs.getInt("t"));
			System.out.println("몸무게"+rs.getInt("w"));
			System.out.println("나이"+rs.getInt("age"));
			
			
		}
		rs.close();
		stmt.close();
		conn.close();
		
		
		
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
	
	
	
	
	
	
		
	}

}
