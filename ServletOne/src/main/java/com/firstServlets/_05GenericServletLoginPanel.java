package com.firstServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


public class _05GenericServletLoginPanel extends GenericServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		PrintWriter out = response.getWriter();
		
		if(name.equals(pass))
		{
			out.println("welcome " + name);
		}
		else {
			out.println("please enter correct Credentials ");
		}
	}
	

}
