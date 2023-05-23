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

import com.dao.memberDAO;
import com.vo.member;

/**
 * Servlet implementation class memberUpdate
 */
@WebServlet("/update")
public class memberUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/*
	 * list.jsp에서 수정버튼을 눌렀을 때 select 데이터베이스 사용
	 * update.jsp페이지로 이동
	 */
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//준비
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		//수정할 데이터를 조회해서 페이지로 이동작업
		try {
			ServletContext sc = this.getServletContext();
			Connection conn = (Connection)sc.getAttribute("conn");
			
			//list.jsp에서 [수정]에서 update?mon=xxx 이부분
			int mon = Integer.parseInt(request.getParameter("mon"));
			
			memberDAO memberdao = new memberDAO(); // 조회작업을 위한 데이터베이스
			memberdao.setConnection(conn);
			
			member member = memberdao.selectOne(mon); // 데이터베이스 조회
			
			request.setAttribute("members", member); // 조회자료 저장
			
		}catch(Exception e) {
			
		}
		
		//이동
		RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
		rd.forward(request, response);
	}
/*
 * update.jsp에서 수정버튼을 눌렀을 때 update 데이터베이스 사용
 * list.jsp페이지로 이동
 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		try {
			ServletContext sc = this.getServletContext();
			Connection conn = (Connection)sc.getAttribute("conn");
			
			member temp = new member();
			temp.setMon(Integer.parseInt(request.getParameter("Mon"))); //()안에 이름은 update.jsp name을 참고
			temp.setMname(request.getParameter("mname"));
			temp.setEmail(request.getParameter("email"));
			temp.setPwd(request.getParameter("pwd"));
			
			memberDAO memberdao = new memberDAO();
			memberdao.setConnection(conn);
			
			memberdao.update(temp);
		}catch(Exception e) {
			
		}
		
		
	}
}


	


