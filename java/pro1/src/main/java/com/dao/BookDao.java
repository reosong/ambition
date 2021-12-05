package com.dao;

import java.sql.*;
import java.util.*;

import javax.naming.*;
import javax.sql.*;

import com.Dto.*;

public class BookDao {
	
	/* String url ="jdbc:oracle:thin:@localhost:1521:xe";
     String id ="system";
     String pw ="oracle";
     String driver = "oracle.jdbc.OracleDriver";
     */
	
	DataSource dataSource;
	
     
     
     public BookDao() {
    	 try {
 //   		 Class.forName(driver);
    		 Context context = new InitialContext();
    		 dataSource = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
    	 }catch(Exception e){
    		 e.printStackTrace();
    	 }
     }
     
     public ArrayList<BookDto> select(){
    	 
    	 ArrayList<BookDto> list = new ArrayList<BookDto>();
    	 
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
    			 
    			 BookDto bookDto = new BookDto(name,password,email);
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
