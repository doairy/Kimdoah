package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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


@WebServlet("/insert")
public class bankInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8"); //나가는 값
		
		RequestDispatcher rd = request.getRequestDispatcher("bankInsert.jsp");
		rd.forward(request, response); //해당페이지로 그냥 이동 
		
				
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	response.setContentType("UTF-8");
	
	Connection conn = null;
	PreparedStatement stmt = null;
	String sql = null;
	
	try {DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
			"sample","1234");
		System.out.println("insert 데이터 베이스 연결 성공");
		
		sql = "insert into bank(banum,baname,baitem,bamoney,badate,bamon) "
				+ "value (?,?,?,?,?,?)";
		System.out.println("sql 연결성공");
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, request.getParameter("banum"));
		System.out.println("1");
		stmt.setString(2,request.getParameter("baname"));
		System.out.println("2");
		stmt.setString(3,request.getParameter("baitem"));
		System.out.println("3");
		stmt.setInt(4, Integer.parseInt(request.getParameter("bamoney")));
		System.out.println("4");
		stmt.setString(4, request.getParameter("badate"));
		System.out.println("5");
		stmt.setInt(5, Integer.parseInt(request.getParameter("bamon")));
		System.out.println("6");
		stmt.executeUpdate();		
		System.out.println("sql 입력 성공");
	} catch(SQLException e) {
		
	}finally {
		try {stmt.close();} catch(Exception e) {} //문법
		try {conn.close();} catch(Exception e) {}
	}
	response.sendRedirect("list");
	}

}
