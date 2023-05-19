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
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * 목록에서 수정버튼을 클릭했을 때 요청을 처리하는 부분
     * 수정페이지 이동
     */
    
			protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// 사용준비
				request.setCharacterEncoding("UTF-8");
				response.setContentType("text/html;charset=UTF-8");
				
				//작업
				
				//페이지 이동
				 RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
				 rd.forward(request, response); // rd.include()
			}

			/*
			 * 회원수정 폼에서 수정버튼을 눌렀을 때 처리하는 부분
			 */
			
			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				request.setCharacterEncoding("UTF-8");
				response.setContentType("text/html;charset=UTF-8");
				//1. 데이터베이스 준비
				Connection conn = null;
				PreparedStatement stmt = null;
				ResultSet rs = null; // 삽입, 수정, 삭제제외
				String sql = null;
				
				//2. 데이터베이스 연결
				try {
					DriverManager.registerDriver(new com.mysql.jdbc.Driver());
					conn = DriverManager.getConnection("http://localhost:3306/servlet", "sample","1234"); //주소,포트/데이터베이스명,아이디,비밀번호
					//3. 데이터베이스 작업
					sql = "SELECT mon, mname, email, pwd FROM members where mon =?(mname, email, pwd) into (?,?,?)"; //추가
					stmt= conn.prepareStatement(sql);
					stmt.setString(1,request.getParameter("mon")); // insert.jsp =>name 으로 선언한 이름
					
					member members = new member();
					rs = stmt.executeQuery();
					rs.next();
					members.setMon(rs.getInt("mon"));
					members.setMname(rs.getString("mname"));
					members.setEmail(rs.getString("email"));
					members.setPwd(rs.getString("pwd"));
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {rs.close();} catch(Exception e) {}
					try {stmt.close();} catch(Exception e) {}
					try {conn.close();} catch(Exception e) {}
				}
				
				
				//페이지 이동
				 RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
				 rd.forward(request, response); // rd.include()
			}
				
				
				//
			}

		