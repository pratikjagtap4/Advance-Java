package reDirectMethod;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class _01LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "jdbc:mysql://localhost:3306/studentsdata";
		String user = "root";
		String pass = "root@123";
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url , user , pass);
			Statement stmt= con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from student_cred where email ='"+username+"' and password = '"+password+"'");
			
			if(rs.next()) {
				response.sendRedirect("welcome");
			}
			else {
				response.sendRedirect("https://www.netflix.com/in/");
			}
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
