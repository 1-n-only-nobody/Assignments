<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apparel</title>
</head>
<body>
<a href="bill.jsp">Go to Bill</a>
<form action="" method="get">
	<label>Shirt</label><input type="radio" name="radioItem" value="shirt">
	<label>Pant</label><input type="radio" name="radioItem" value="pant">
	<label>Cap</label><input type="radio" name="radioItem" value="cap">
	<input type="submit">
</form>
<%
	String cart = request.getParameter("radioItem");
	session.setAttribute("cart", cart);
	out.println(cart);
%>
<a href="electronics.jsp">Go to electronics</a>
</body>
</html>