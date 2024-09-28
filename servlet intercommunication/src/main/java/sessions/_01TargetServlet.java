package sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class _01TargetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String uname = (String)session.getAttribute("user");
	
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<h1> Welcome Mr." + uname + " </h1>");
		
//		out.println("<a href='maharaj'> click here </a>");
		response.sendRedirect("maharaj");
	}

}
