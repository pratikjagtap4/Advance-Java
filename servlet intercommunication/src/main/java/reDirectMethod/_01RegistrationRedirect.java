package reDirectMethod;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class _01RegistrationRedirect extends HttpServlet {
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
			
			Connection con = DriverManager.getConnection(url , user , pass);
			
			PreparedStatement stmt = con.prepareStatement("insert into student_cred values(?,?,?,?,?,?,?)");
			
			stmt.setInt(1, id);
			stmt.setString(2, firstname);
			stmt.setString(3, lastname);
			stmt.setInt(4, standard);
			stmt.setInt(5, phone);
			stmt.setString(6, email);
			stmt.setString(7, password);
			
			int result = stmt.executeUpdate();
			
			if(result>0) {
				response.sendRedirect("LoginReDirect.html");
			}
			else {
				
			}
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
