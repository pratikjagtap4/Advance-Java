package com.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.model.Calculation;

public class AverageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int math =Integer.parseInt( request.getParameter("maths"));
		int physics =Integer.parseInt( request.getParameter("physics"));
		int chemistry =Integer.parseInt( request.getParameter("chemistry"));
		int english =Integer.parseInt( request.getParameter("english"));
		
		Calculation obj = new Calculation();
		double result  = obj.calculate(math, physics, chemistry, english);
		
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("output.jsp");
		
		rd.forward(request, response);
		
		
		
	}

}
