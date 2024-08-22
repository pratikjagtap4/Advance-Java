package httpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class _02httpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		String name = request.getParameter("name");
		String team = request.getParameter("team");
		String player = request.getParameter("player");
		
		PrintWriter out = response.getWriter();
		
		out.println("my favourite sport is " + name  + " and my favourite team is " + team + " and my favourite player is " + player);
		
	}

}
