package filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


public class _02LoginFilter extends HttpFilter implements Filter {

	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String url = "jdbc:mysql://localhost:3306/studentsdata";
		String user = "root";
		String pass = "root@123";
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url ,user , pass);
			
			PreparedStatement pst = con.prepareStatement("select * from student_cred where email = ? and password = ?");
			
			pst.setString(1, username);
			pst.setString(2, password);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				chain.doFilter(request, response);
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("Error.html");
				rd.forward(request, response);
			}
		} 
		catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
	}

	

}
