package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.vo.member; // 패키지명.클래스명(파일명)
/**
 * list에서 등록을 클릭했을 때 요청 처리하는 부분
 */
@WebServlet("/insert")
public class insert extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용준비
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		//작업
		
		//페이지 이동
		 RequestDispatcher rd = request.getRequestDispatcher("insert.jsp");
		 rd.forward(request, response); // rd.include()
	}

	/*
	 * 회원등록 폼에서 회원등록버튼을 눌렀을 때 요청을 처리하는 부분
	 * 회원정보를 데이터베이스에 저장을 하고, 목록으로 다시 이동
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 데이터베이스 준비
		
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
				Connection conn = null;
//				Statement stmt = null;
				PreparedStatement stmt = null;
				ResultSet rs = null; // 삽입, 수정, 삭제제외
				String sql = null;
				
				//2. 데이터베이스 연결
				try {
					DriverManager.registerDriver(new com.mysql.jdbc.Driver());
					conn = DriverManager.getConnection("http://localhost:3306/servlet", "sample","1234"); //주소,포트/데이터베이스명,아이디,비밀번호
					
					//3. 데이터 베이스 작업
					sql = "INSERT INTO members(mname, email, pwd) into (?,?,?)"; //추가
					stmt= conn.prepareStatement(sql);
					stmt.setString(1,request.getParameter("tname")); // insert.jsp =>name 으로 선언한 이름
					stmt.setString(2,request.getParameter("email"));
					stmt.setString(3,request.getParameter("pwd"));
					stmt.executeUpdate();
					
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					
					try {stmt.close();} catch(Exception e) {}
					try {conn.close();} catch(Exception e) {}
				}
				
				
				//페이지 이동
				response.sendRedirect("list"); // 작업컨트롤로 이동
			
				
			
	
	
		
		//
	}
}


