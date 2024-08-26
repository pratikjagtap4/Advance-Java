package intercommunication;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class _01LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
		String url = "jdbc:mysql://localhost:3306/studentsdata";
		String user = "root";
		String pass = "root@123";
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			out.println("<h2>" + request.getAttribute("success") + "</h2>");
			
			
			Connection con = DriverManager.getConnection(url , user , pass);
			Statement stmt= con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from student_cred where email = '"+username+"' and password = '"+password+"'");
			
			RequestDispatcher rd = request.getRequestDispatcher("home");
			
			if(rs.next()) {
				request.setAttribute("message", "Welcome " + rs.getString(2));
				
				rd.forward(request ,  response);
			}
			else {
				response.setContentType("text/html");
				rd = request.getRequestDispatcher("login.html");
				
				
				out.println("<h2 style = 'color:red'> Wrong credentials </h2>");
				
				rd.include(request , response);
			}
			
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}	
	}
}
