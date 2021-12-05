package com.Dao;

import java.sql.*;
import java.util.*;

import javax.naming.*;
import javax.sql.*;

import com.Dto.*;

public class LoginDao {

	/* String url ="jdbc:oracle:thin:@localhost:1521:xe";
    String id ="system";
    String pw ="oracle";
    String driver = "oracle.jdbc.OracleDriver";
    */
	
	DataSource dataSource;
	
    
    
    public LoginDao() {
   	 try {
//   		 Class.forName(driver);
   		 Context context = new InitialContext();
   		 dataSource = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g1");
   	 }catch(Exception e){
   		 e.printStackTrace();
   	 }
    }
    
    public ArrayList<LoginDto> select(){
   	 
   	 ArrayList<LoginDto> list = new ArrayList<LoginDto>();
   	 
   	 Connection con = null;
   	 PreparedStatement pstmt = null;
   	 ResultSet res = null;
   			 
   			 
   	 try {
   //		 con = DriverManager.getConnection(url,id, pw);
   		 con= dataSource.getConnection();
   		 
   		 String sql = "select * from younsinsa_member";
   		 pstmt = con.prepareStatement(sql);
   		 res = pstmt.executeQuery();
   		 
   		 while(res.next()) {
   			 String name = res.getString("id");
   			 String password = res.getString("pw");
   			 String email = res.getString("email");
   			 
   			 LoginDto bookDto = new LoginDto(name,password,email);
   			 list.add(bookDto);
   			 
   		 }
   		 
   		 
   	 }catch(Exception e){
   		 e.printStackTrace();
   		 
   	 }finally {
   		 try {
   			 res.close();
   			 pstmt.close();
   			 con.close();
   			 
   		 }catch(Exception e2) {
   			 e2.printStackTrace();
   		 }
   	 }
   	 return list;
    }
    
    
    
    
}
