<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Report Card</h2>
	
	<h3> You got <%= request.getAttribute("result")  %> average</h3>
	
	<h3>Thank you</h3>
</body>
</html>