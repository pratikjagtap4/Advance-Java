package sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class _02LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		
		Cookie cookies[] = request.getCookies();
		HttpSession session = request.getSession();

		
		for(int i = 0 ; i< cookies.length ; i++) {
			System.out.println(cookies[i].getName());
			System.out.println(cookies[i].getValue());
		}
		
		response.addCookie(new Cookie("virat" , "king"));
		response.addCookie(new Cookie("rohit" , "hitman"));
		if(uname.equals("pratik") && pass.equals("Pratik@4401")) {
			session.setAttribute("uname", uname );
			session.setAttribute("pass", pass);
			
			response.sendRedirect("welcomeUser");
		}
		else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			RequestDispatcher rd = request.getRequestDispatcher("LoginSession.html");
			out.println("<h2 style = 'color:red'> Wrong credentials </h2>");
			rd.include(request, response);
		}
	}

}
