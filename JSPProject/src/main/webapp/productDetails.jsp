<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="product" class="productInfo.ProductDetails">
		<jsp:setProperty name="product" property="*"/>
	</jsp:useBean>
	
	Id: <jsp:getProperty name="product" property="id"/>
	Name: <jsp:getProperty name="product" property="name"/>
	Description: <jsp:getProperty name="product" property="description"/>
	Price: <jsp:getProperty name="product" property="price"/>
</body>
</html>