<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Is palindrome or not</h2>
	
	<p>
		<%
			int num = Integer.parseInt(request.getParameter("num"));
		
			int cpy = num;
			int rev = 0;
			while(cpy > 0){
				int r = cpy %10;
				
				rev = rev*10 + r;
				
				cpy = cpy /10;
			}
			
			if(rev == num){
				out.println("number is palindrome");
			}
			else{
				out.println("number is not palindrome number");
			}
		%>
	</p>
</body>
</html>