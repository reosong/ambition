package data;

import java.sql.*;

public class DBHelper {
public static Connection dbConn;
    
    public static Connection getConnection()
    {
        Connection connect = null;
        try {
            String user = "system"; 
            String pw = "oracle";
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            
            Class.forName("oracle.jdbc.driver.OracleDriver");        
            connect = DriverManager.getConnection(url, user, pw);
        } catch (ClassNotFoundException cnfe) {
            System.out.println("DB 드라이버 로딩 실패 :"+cnfe.toString());
        } catch (SQLException sqle) {
            System.out.println("DB 접속실패 : "+sqle.toString());
        } catch (Exception e) {
            System.out.println("Unkonwn error");
            e.printStackTrace();
        } finally {
			try {
				if(connect != null)
					connect.close();
				// Connection 객체를 닫는다. 사용된 리소스같은것들을 colse메소드가 해제해줌
			} catch (final SQLException e) {
				System.out.println("conn.close() 에러");
			}
       
        return connect;     
     

      
        }
}
}