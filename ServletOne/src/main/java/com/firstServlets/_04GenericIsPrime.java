package com.firstServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class _04GenericIsPrime extends GenericServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		int num = Integer.parseInt(request.getParameter("num"));
		
		boolean flag = true;
		
		int mid = num/2;
		
		for(int i = 2; i <= mid ; i++) {
			
			if(num % i ==0) {
				flag = false;
				break;
			}
			
		}
		
		PrintWriter out = response.getWriter();
		if(flag) {
			out.println(num  + " is prime number");
		}
		else {
			out.println(num + " is not a prime number");
		}
	}

}
