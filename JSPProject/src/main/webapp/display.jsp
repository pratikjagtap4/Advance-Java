<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Display Page</h2>
	
	<h4>Beginning of display page</h4>
	<jsp:forward page="info.jsp" >
	
		<jsp:param name="name" value="pratik"/>
		<jsp:param name="pass" value="123456"/>
	</jsp:forward>
	<h4>End of display page</h4>
</body>
</html>