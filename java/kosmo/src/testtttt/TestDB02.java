package testtttt;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

public class TestDB02 {

private static String driver = "oracle.jdbc.OracleDriver"; 

private static String url = "jdbc:oracle:thin:@localhost:1521:xe";

private static String dbuid = "hr";

private static String dbpwd = "1234";

public static void main(String[] args) throws ClassNotFoundException, SQLException  {

Class.forName(driver);

Connection conn = DriverManager.getConnection(url,dbuid,dbpwd);

Statement stmt = conn.createStatement();

String sql = "";

sql += "select employee_id 번호,";

sql += " first_name || ' ' || last_name 이름,";

sql += " salary 월급, ";

sql += " (salary*12 + salary*commission_pct) 연봉,";

sql += " department_id 부서번호";

sql += " from employees";

sql += " where department_id = 60"; 

System.out.println("sql:"+sql);

ResultSet rs = stmt.executeQuery(sql);




while(rs.next()) {

        int num = rs.getInt(1);

        String name = rs.getString(2);

        double sal = rs.getDouble(3);

        double ysal = rs.getDouble(4);

        int deptid = rs.getInt(5);

        String fmt = "%d %s %.2f %.2f %d";

        String msg = String.format(fmt, num, name, sal, ysal, deptid);

        System.out.println(msg);

}

rs.close();

stmt.close();

conn.close();

}


	
	
}
