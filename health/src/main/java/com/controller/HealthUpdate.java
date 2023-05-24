package com.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HealthDAO;
import com.vo.HealthVO;

/**
 * Servlet implementation class HealthUpdate
 */
@WebServlet("/update")
public class HealthUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 목록에서 검진번호를 눌렀을 때
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		//보낼값을 준비
		
		//값을 가지고 페이지 이동
		RequestDispatcher rd = request.getRequestDispatcher("/health/update.jsp");
		rd.forward(request, response);
	}

	/**
	 * update.jsp에서 수정버튼을 눌렀을 때 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
	

		try {
			//web.xml 데이터베이스 정보 읽어온다.
			ServletContext sc = this.getServletContext();
			Connection conn = (Connection) sc.getAttribute("conn"); // 데이터베이스 연결
			
			
			HealthDAO healthdao = new HealthDAO(); // 데이터베이스 SQL 작업
			healthdao.setConnection(conn); // 데이터베이스와 DAO 연결
			 // 데이터베이스 검색을 통해서 전체 자료를 읽어온다.
			
			//import java.util.date로 연결
			HealthVO healthvo = new HealthVO();
			healthvo.setId(Integer.parseInt(request.getParameter("id")));
//			healthvo.setHdate(new Date()); //request.getParameter("hdate"));
			healthvo.setHweight(Integer.parseInt(request.getParameter("hweight")));
			healthvo.setHheight(Integer.parseInt(request.getParameter("hheight")));
			healthvo.setHblood(Integer.parseInt(request.getParameter("hblood")));
			healthvo.setEid(Integer.parseInt(request.getParameter("eid")));
			
			
			healthdao.update(healthvo); // 여러개 전달 변수명 뒤에 s붙인다.
			//View에 list.jsp에 사용할 수 있게 자바프로그램을 추가
			
		} catch (Exception e) {
			
		}
		response.sendRedirect("list");
	
	}

	
	}


