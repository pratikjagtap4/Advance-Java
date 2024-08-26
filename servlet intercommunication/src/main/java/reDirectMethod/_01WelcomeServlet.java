package reDirectMethod;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class _01WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String url = "jdbc:mysql://localhost:3306/studentsdata";
		String user = "root";
		String pass = "root@123";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url , user , pass); 
			
			PreparedStatement pst = con.prepareStatement("select * from student_cred");
			
			ResultSet rs = pst.executeQuery();
			
			PrintWriter out = response.getWriter();
			
			out.println("<html>");
			out.println("<head>");
			out.println("<title> HomeServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<table>");
			out.println("<tr>");
			out.println("<th> id </th>");
			out.println("<th> firstname </th>");
			out.println("<th> lastname </th>");
			out.println("<th> class </th>");
			out.println("<th> phone no. </th>");
			out.println("<th> email </th>");
			out.println("<th> password </th>");
			out.println("</tr>");
			
			
			while(rs.next()) {
				out.println("<tr>");
					out.println("<td>"+ rs.getInt(1)+" </td>");
					out.println("<td>"+ rs.getString(2)+" </td>");
					out.println("<td>"+ rs.getString(3)+" </td>");
					out.println("<td>"+ rs.getInt(4)+" </td>");
					out.println("<td>"+ rs.getInt(5)+" </td>");
					out.println("<td>"+ rs.getString(6)+" </td>");
					out.println("<td>"+ rs.getString(1)+" </td>");
				out.println("</tr>");
			}
			out.println("/<table>");
			out.println("</body>");
			out.println("</html>");
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
