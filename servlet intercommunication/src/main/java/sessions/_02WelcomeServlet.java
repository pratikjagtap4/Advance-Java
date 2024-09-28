package sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class _02WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		String uname = (String) session.getAttribute("uname");
		String pass = (String) session.getAttribute("pass");
		
		PrintWriter out = response.getWriter();
		out.println("<h2> Username is " + uname + " </h2>");
		out.println("<h2> password is " + pass + " </h2>");
	}

	 
}
