package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import com.vo.HealthVO;

public class HealthDAO {
	Connection connection; //데이터베이스 연결을 위한 전역 변수
	
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	//질의어 작업(검색, 삽입, 삭제, 수정(1개검색))
	//전체 검색
	//select사용하는 곳에는 ResultSet 선언
	//전체 검색은 List<com.vo> 전달
	public List<HealthVO> selectList() throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		String sql = null;
		
		sql = "select * from health";
		//? 없으면 createStatement()를 생성
		
		stmt = connection.createStatement(); // 데이터베이스 구동
		rs = stmt.executeQuery(sql);
		
	
			
			//결과처리(변수명은 클래스명을 소문자로 구성)
			ArrayList<HealthVO> healthvo = new ArrayList<HealthVO>();
			
			//여러개의 결과값이 존재하면
			 while(rs.next()) {
				 HealthVO temp = new HealthVO();
				 //저장작업
				 temp.setEid(rs.getInt("eid"));
				 temp.setHblood(rs.getInt("hlbood"));
				 temp.setHdate(rs.getDate("hdate"));
				 temp.setHheight(rs.getInt("hheight"));
				 temp.setHweight(rs.getInt("hweight"));
				 temp.setId(rs.getInt("id"));
				 
				 healthvo.add(temp); // 배열에 저장
			 }
			 return healthvo;
			
		} 
		
	
	//삽입 수정 삭제 int 선언
	//삽입(인수를 healthVO로 받아서 입력)
	public int insert(HealthVO healthvo) throws Exception  {
		PreparedStatement stmt = null;
		String sql = null;
		//?가 있으면 preparestatement
		sql = "INSERT INTO health (hdate,hweight, hheight,hblood, eid) VALUES (?,?,?,?,?)"; 
		stmt = connection.prepareStatement(sql);
		stmt.setDate(1, (Date)healthvo.getHdate());
		stmt.setInt(2, healthvo.getHweight());
		stmt.setInt(3, healthvo.getHheight());
		stmt.setInt(4, healthvo.getHblood());
		stmt.setInt(5, healthvo.getEid());
		
		
		return stmt.executeUpdate();

	}
	//삭제 (번호를 받아서 작업)
	public int delete(int id) throws Exception{
		PreparedStatement stmt = null;
		String sql = null;
		
		sql = "DELETE FROM health WHERE `health`.`id` = ?";
		stmt = connection.prepareStatement(sql);
		stmt.setInt(1, id);
		
		return stmt.executeUpdate(); 
	}
	//수정
	public HealthVO selectOne(int id) throws Exception {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = null;
		
		sql = "SELECT * FROM `health` WHERE `id` =?" ;
		
		stmt = connection.prepareStatement(sql);
		stmt.setInt(1, id);
		
		rs = stmt.executeQuery();
		
		
			rs.next(); 
			HealthVO temp = new HealthVO();
				 //저장작업
		temp.setEid(rs.getInt("eid"));
		temp.setHblood(rs.getInt("hlbood"));
		temp.setHdate(rs.getDate("hdate"));
		temp.setHheight(rs.getInt("hheight"));
		temp.setHweight(rs.getInt("hweight"));
		temp.setId(rs.getInt("id"));
				 
				
			 
		return temp;
			
	}
	//healthVO를 받아서 처리, int 선언
	public int update(HealthVO healthvo) throws Exception {
		PreparedStatement stmt = null;
		String sql = null;
		  sql = "UPDATE health SET hdate =?, hweight =?, hheight =?, hblood =?, eid= ? WHERE id =?";
	      stmt = connection.prepareStatement(sql);
	      stmt.setDate(1, (Date)healthvo.getHdate());
	      stmt.setInt(2, healthvo.getHweight());
	      stmt.setInt(3, healthvo.getHheight());
	      stmt.setInt(4, healthvo.getHblood());
	      stmt.setInt(5, healthvo.getEid());
	      stmt.setInt(6, healthvo.getId()); // 변경하고자 하는 번호
	      
	      return stmt.executeUpdate();
	      
	
		
	
		
	}
}
