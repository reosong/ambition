package data;

import java.sql.*;
import java.util.*;

public class JDBC02_Select {
    public static void main(String[] args) {
    Connection con = null;
    PreparedStatement pstmt = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver"); 
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
            System.out.println("연결성공");
            
            Scanner sc =new Scanner(System.in);
            System.out.printf("저장할 번호를 입력하세요: ");
            String num = sc.nextLine();
            
            System.out.printf("이메일을 입력하세요: ");
            String name = sc.nextLine();
            
            System.out.printf("이름을 입력하세요: ");
            String email = sc.nextLine();
            
            System.out.printf("전화번호를 입력하세요: ");
            String tel = sc.nextLine();
            
          
            String sql = "insert into customer values(?,?,?,?)"; //? 는prepareStatement 가 알아봐요
            pstmt =con.prepareStatement(sql);
            pstmt.setInt(1,Integer.parseInt(num)); // 테이블의 데이터타입에 뭦춰주는것 잊지마.
            pstmt.setString(2,name);
            pstmt.setString(3,email);
            pstmt.setString(4,tel);
            
            int result = pstmt.executeUpdate();
            if(result ==1) System.out.println("inset 저장 성공!");
            else System.out.println("저장 실패");
            
        } catch (SQLException e) {
            System.out.println("DB 연결 실패 무언가 잘못됬다.. 드라이버 연결 정보 오류");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("DB 연결 실패 무언가 잘못됬다..  드라이버 클래스 파일 오류");
            e.printStackTrace();
        }catch (Exception e) {
            System.out.println("별도의 사유로 연결 실패");
            e.printStackTrace();
            
        }try {//con!= null 열린다.
                if(con!= null)con.close();
                if(pstmt!= null)pstmt.close();
                System.out.println("데이터베이스가 잘 종료되었다.");
            } catch (SQLException e) {
            }
        
        
    }
}




