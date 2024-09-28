<%@ page import="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition</title>
</head>
<body>
	<h2>Addition of two number</h2>
	
	<p>
	
		<%
			ArrayList<Integer> numbers = new ArrayList<Integer>();
		
			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));
			
			numbers.add(num1);
			numbers.add(num2);
			
			int sum = num1 + num2;
			
		%>
		
		The Sum of <%= num1 %> and <%= num2 %> is <%=sum %>
		All numbers of arraylist are <%=numbers %>
	</p>
</body>
</html>