package com.kru.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kru.springmvc.LoginService;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{
	
	private LoginService userValidationService = new LoginService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		request.setAttribute("name",request.getParameter("name"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		String name =request.getParameter("name");
		String password = request.getParameter("password");
		
		boolean isUserValid = userValidationService.isUseValid(name, password);
		
		if(isUserValid) {
			request.setAttribute("name",name);
			request.setAttribute("password",password);
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("errorMsg", "Invalid credentials");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}
}
