package bbs;

import java.sql.*;
import java.util.*;

public class BbsDao {

	
	private Connection con;

	private ResultSet rs;
	
	public BbsDao() {
		try {
			String url = "jdbc:mysql://localhost:3306/bbs";
			String id = "root";
			String password = "1234";
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,id,password);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public String getDate() {
		String sql = "select now()";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public int getNext() {
		String sql = "select bbsID from bbs order by bbsID desc";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getInt(1) + 1;
			}
			return 1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int write(String bbsTitle, String userID ,String bbsContent) {
		String sql = "insert into bbs values(?,?,?,?,?,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, getNext());
			pstmt.setString(2,bbsTitle);
			pstmt.setString(3, userID);
			pstmt.setString(4, getDate());
			pstmt.setString(5, bbsContent);
			pstmt.setInt(6, 1);
			
			
			return  pstmt.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	public ArrayList<Bbs> getList(int pageNumber){
		String sql = "SELECT * FROM bbs WHERE bbsID < ? AND bbsAvailable =1 order by bbsID desc limit 10";
		ArrayList<Bbs> list = new ArrayList<Bbs>();
		try {
			
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1,getNext() -(pageNumber -1)*10);
			
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
			Bbs bbs = new Bbs();
			
			
			bbs.setBbsID(rs.getInt(1));
			bbs.setBbsTitle(rs.getString(2));
			bbs.setUserID(rs.getString(3));
			bbs.setBbsDate(rs.getString(4));
			bbs.setBbsContent(rs.getString(5));
			bbs.setBbsAvailable(rs.getInt(6));
			list.add(bbs);
			
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public boolean nextPage(int pageNumber) {
		String sql ="SELECT * FROM bbs WHERE bbsID < ? AND bbsAvailable = 1 order by bbsID desc limit 10";
		ArrayList<Bbs> list = new ArrayList<Bbs>();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, getNext() -(pageNumber -1)*10);
			rs = pstmt.executeQuery();
			if(rs.next()) {
			return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//하나의 게시글을 보는 메소드
		public Bbs getBbs(int bbsID) {
			String sql = "select * from bbs where bbsID = ?";
			try {
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, bbsID);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					Bbs bbs = new Bbs();
					bbs.setBbsID(rs.getInt(1));
					bbs.setBbsTitle(rs.getString(2));
					bbs.setUserID(rs.getString(3));
					bbs.setBbsDate(rs.getString(4));
					bbs.setBbsContent(rs.getString(5));
					bbs.setBbsAvailable(rs.getInt(6));
					return bbs;
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
	
	
	
	
	
}
