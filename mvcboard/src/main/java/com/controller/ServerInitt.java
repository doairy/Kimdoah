package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class ServerInitt
 */

public class ServerInitt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 데이터베이스 사용준비
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config); // 초기화
		try {
		ServletContext sc = this.getServletContext(); // web.xml파일 읽기
		Class.forName(sc.getInitParameter("driver")); //사용할 데이터베이스 드라이버
		
		//getConnection(url, 아이디, 비밀번호);
		String url = sc.getInitParameter("url");
		String username = sc.getInitParameter("username");
		String password = sc.getInitParameter("password");
		
		Connection conn ;
		
		conn  = DriverManager.getConnection(url,username,password);
		sc.setAttribute("conn", conn); // 환경변수에 데이터베이스 정보를 저장
		//System.out.println 활용할 때는 메서드와 메서드사이에 넣어서 동작확인
		System.out.println("서블릿 사용 준비가 완료되었습니다.");
		}catch (Exception e) {
			System.out.println("서블릿 사용 준비중 오류가 발생하였습니다..");
			e.printStackTrace();
		}
		
		
	}

	/**
	 * 데이터베이스 종료
	 */
	public void destroy() {
		super.destroy();
		//환경변수에 저장된 데이터베이스 정보로 연결을 시도한다.
		Connection conn = (Connection)this.getServletContext().getAttribute("conn");
		try {
		if(conn != null && conn.isClosed() == false) conn.close();
		System.out.println("정상적으로 데이터베이스를 종료하였습니다.");
		
	}catch(Exception e) {
		System.out.println("비정상적으로 데이터베이스를 종료하였습니다.");
		e.printStackTrace();
	}
		
	}
	/*
	 * 작성 후 프로젝트를 실행해서 콘솔에 메세지를 확인
	 */
}
