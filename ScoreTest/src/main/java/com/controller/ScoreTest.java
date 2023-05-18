package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/score")
public class ScoreTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
//   String getUrl = ("scoreInput.jsp");
//   String postUrl = ("scoreResult.jsp");

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = "text/html; charset = UTF-8";
		request.setCharacterEncoding("UTF-8");
		response.setContentType(type);
		
		RequestDispatcher rd = request.getRequestDispatcher("/scoreInput.jsp");
		rd.include(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = "text/html; charset = UTF-8";
		request.setCharacterEncoding("UTF-8");
		response.setContentType(type);
		
		RequestDispatcher rd = request.getRequestDispatcher("/scoreResult.jsp");
		rd.include(request, response);
	}

}
