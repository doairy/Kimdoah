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

import com.dao.memberDAO; // 데이터베이스 구동
import com.vo.member; // 값을 저장(검색, 수정,
/**
 * 회원 목록을 출력하는 클래스
 */
@WebServlet("/list")
public class memberList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 웹브라우저에서 요청이 들어왔을때
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//준비
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		//데이터베이스 작업
		try {
			//DB연결
			ServletContext sc = this.getServletContext();
			Connection conn = (Connection) sc.getAttribute("conn");
			//사용할 테이블에 맞는 DAO를 생성
			memberDAO memberdao = new memberDAO(); // DAO를 생성
			memberdao.setConnection(conn); //DAO를 데이터베이스 연동
			
			//memberdao.selectList의 결과를 members 저장해서 전달
			request.setAttribute("members", memberdao.selectList());
			
			
		}catch(Exception e) {
		
		}
		
		//연결
		RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
		rd.forward(request, response);
	}
}

