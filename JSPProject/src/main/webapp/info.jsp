<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h6>Beggining of info</h6>
	<%= request.getParameter("name") %>
	<%= request.getParameter("pass") %>
	<h6>End of info</h6>
</body>
</html>