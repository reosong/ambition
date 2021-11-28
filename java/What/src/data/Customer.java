package data;

import java.sql.*;

public class Customer {
	    public static void main(String[] args) {
	      	 Connection con = null;
	         PreparedStatement pstmt = null;
	         ResultSet rs =null;
	                    
	         String url ="jdbc:oracle:thin:@localhost:1521:xe";
	         String id ="system";
	         String pw ="oracle";
	         String driver = "oracle.jdbc.OracleDriver";
	                        
	        try {
	         Class.forName(driver); 
	         con = DriverManager.getConnection(url,id,pw);
	          System.out.println("연결성공");
	    String sql= "select * from customer";
	          pstmt =con.prepareStatement(sql);
	          rs=pstmt.executeQuery(); //select만씀
	          System.out.println("번호\t이름\t이메일\t\t전화번호");
	          System.out.println("----------------------------------------");
	          while(rs.next()) { //레코드가 있음 계속 반복
	               int num =rs.getInt("num");
	               String name = rs.getString("name");
	               String email =rs.getString("email");
	               String tel = rs.getString("tel");
	               System.out.printf("%d\t%s\t%s\t%s\n",num,name,email,tel);
	                                
	                }
	            } catch (SQLException e) {
	           System.out.println("DB연결 실패 무언가 틀렸다.. 드라이버 연결 정보 오류");
	                            
	               e.printStackTrace();
	             } catch (ClassNotFoundException e) {
	           System.out.println("DB연결 실패 무언가 틀렸다..  드라이버 클래스 파일 오류");
	           e.printStackTrace();
	            }catch (Exception e) {
	           System.out.println("별도의 사유로 연결 실패");
	           e.printStackTrace();
	              }
	              // 만약 연결이 안되게되었다면 열려있는 con객체를 닫아야한다. 
	          try {
	               if(con!= null)con.close();
	               if(pstmt!= null)pstmt.close(); //각각의 객체도 닫아줘야함
	               if(rs!= null)rs.close();// 각가의 객체도 닫아줘야함.
	              System.out.println("데이터베이스가 잘 종료되었다.");
	           } catch (SQLException e) {
	           // TODO Auto-generated catch block
	            e.printStackTrace();
	     }
	 
	    }        

}
