<%@ page  import="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2> <c:out value="Welcome to the world of Jstl"></c:out></h2>
	<div>
		<c:set var="fname" value="Pratik"/>
		<c:set var="lname" value="Jagtap"/>
		
		<h3><c:out value="mr. ${fname } ${lname }"/></h3>
		
		<c:set var="abso" value="-50"/>
		<c:if test="${abso<0 }">
			<c:out value="Absolute values is ${abso * -1 } "/>
		</c:if>
		
		<hr>
		
		<h4>Review your marks</h4>
			<c:set var="percent" value="96"/>
			<c:choose>
				<c:when test="${percent < 40 }" ><P>Karo aur masti</P></c:when>
				<c:when test="${percent >= 40 &&percent < 60 }" ><P>aur thoda padho</P></c:when>
				<c:when test="${percent >= 60 &&percent < 80 }" ><P>Aur behtar kar sakte ho</P></c:when>
				<c:when test="${percent >= 80 &&percent < 90 }" ><P>Shabbas</P></c:when>
				<c:otherwise ><P>Shabbas bhai par jara bahar bhi jaya karo</P></c:otherwise>
				
			</c:choose>
			
		<h4>Looping</h4>
		
		<c:forEach var="i" begin="1" end="10">
			<c:if test="${i%2==0 }"><p style="color:green" ><c:out value="${i }"></c:out></p></c:if>
			<c:if test="${i%2!=0 }"><p style="color:red"><c:out value="${i }"></c:out></p></c:if>
		</c:forEach>
		
		<%
			ArrayList<String> present = new ArrayList<String>();
		
			present.add("Pratik");
			present.add("Lucky");
			present.add("Bhima");
			request.setAttribute("students" , present);
		%>
		
		<c:forEach var="student" items="${students }">
			<c:out value="${student }"></c:out>
		</c:forEach>
	</div>
</body>
</html>