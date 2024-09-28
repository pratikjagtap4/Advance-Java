<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<%
			String name = request.getParameter("username");
			String pass = request.getParameter("password");
		%>
		<%
			if(name == "pratik" && pass =="Pratik@4401"){
				out.println("<h1>Login succesul Welcome" + name + "</h1>");
			}
			else{
				out.println("<h1 style='color:red'> Sorry " + name + "Wrong Credentials" + "</h1>");
			}
		%>
	</div>
</body>
</html>