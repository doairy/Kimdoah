package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.VO.bankVO; //VO, DAO를 추가

@WebServlet("/list")
public class bankList extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
					"sample","1234");
			System.out.println("데이터베이스 연결 성공");
			
			sql = "select * from bank";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			ArrayList<bankVO> bank = new ArrayList<bankVO>();
			
			while(rs.next()) {
			bankVO temp = new bankVO();
			temp.setBadate(rs.getDate("badate"));
			temp.setBaitem(rs.getString("baitem"));
			temp.setBanum(rs.getString("banum"));
			temp.setBaname(rs.getString("baname"));
			temp.setBamoney(rs.getLong("bamoney"));
			temp.setBamon(rs.getLong("bamon"));
			
			bank.add(temp);
			}
			request.setAttribute("bank", bank);
		} catch (SQLException e) {
			
			
		} finally {
			try {rs.close();} catch(Exception e) {}  //결과
			try {stmt.close();} catch(Exception e) {} //문법
			try {conn.close();} catch(Exception e) {} //데이터베이스
			
		}
		RequestDispatcher rd = request.getRequestDispatcher("bankList.jsp");
		rd.forward(request, response); //해당페이지로 그냥 이동 
		
				
	}
}

	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8");
//		response.setContentType("UTF-8");
//	}
//
//}
