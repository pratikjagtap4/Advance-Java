<%@ page import="java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorHandler.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ganpati</title>
</head>
<body>	
	<h1>Ganpati Information</h1>
	<div>
		<%!
			Connection con;
			PreparedStatement pst;
			public void jspInit(){
				try{
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					String url = "jdbc:mysql://localhost:3306/Ganpati_info";
					String user = "root";
					String pass = "root@123";
					
					con = DriverManager.getConnection(url , user , pass);
					
					pst = con.prepareStatement("insert into mandal_ values(?,?,?,?)");
					
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
			
			public void jspDestroy(){
				try{
					pst.close();
					con.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		%>
		
		<%
			String name = request.getParameter("mandal_name");
			String area = request.getParameter("area");
			String theme = request.getParameter("theme");
			String prasad = request.getParameter("prasad");
			
			pst.setString(1, name);
			pst.setString(2, area);
			pst.setString(3, theme);
			pst.setString(4, prasad);
			
			pst.executeUpdate();
			
			
		%>
		<div style="color:red"> <%= "Record Inersted" %></div>
		<%@ include file="mandal.html" %>
		
		
	</div>
</body>
</html>