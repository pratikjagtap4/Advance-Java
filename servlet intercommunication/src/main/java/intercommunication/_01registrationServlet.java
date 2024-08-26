package intercommunication;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class _01registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "jdbc:mysql://localhost:3306/studentsdata";
		String user = "root";
		String pass = "root@123";
		
		int id = Integer.parseInt(request.getParameter("id"));
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		int standard = Integer.parseInt(request.getParameter("class"));
		int phone = Integer.parseInt(request.getParameter("phone"));
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			
			Connection con = DriverManager.getConnection(url , user , pass);
			PreparedStatement stmt= con.prepareStatement("insert into student_cred values (?,?,?,?,?,?,?)");
			
			stmt.setInt(1,id);
			stmt.setString(2, firstname);
			stmt.setString(3, lastname);
			stmt.setInt(4,standard);
			stmt.setInt(5,phone);
			stmt.setString(6, email);
			stmt.setString(7, password);
			
			int rs = stmt.executeUpdate();
			
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			
			if(rs > 0) {
				request.setAttribute("success", "Login succesfully");
				rd.forward(request ,  response);
			}
			else {
				response.setContentType("text/html");
				rd = request.getRequestDispatcher("registration.html");
				
				PrintWriter out = response.getWriter();
				
				out.println("<h2 style = 'color:red'> Wrong credentials </h2>");
				
				rd.include(request , response);
			}
			
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
