package studentData;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class _01StudentData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con;
	
	public void init() throws ServletException {
		String url = "jdbc:mysql://localhost:3306/studentsData";
		String userName = "root";
		String password = "root@123";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
		try {
			
			con = DriverManager.getConnection(url , userName , password);
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		int id = Integer.parseInt(request.getParameter("id"));
		
		try {
			
			PreparedStatement stmt = con.prepareStatement("insert into studentInfo values(?,?,?,?,?)");
			stmt.setString(1, fname);
			stmt.setString(2, lname);
			stmt.setString(3, email);
			stmt.setString(4, password);
			stmt.setInt(5, id);
			
			int result = stmt.executeUpdate();
			
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			
			if(result > 0) {
				out.println(result + " data inserted");
			}
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	

	public void destroy() {
		
		try {
			
			con.close();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
