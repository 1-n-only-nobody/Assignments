<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Electronics</title>
</head>
<body>
<a href="bill.jsp">Go to Bill</a>
<%-- <h2> <%= request.getParameter("radioItem") %> </h2> --%>
<form action="" method="get">
	<label>Smartphone</label><input type="radio" name="radioItem1" value="Smartphone">
	<label>Computer</label><input type="radio" name="radioItem1" value="Computer">
	<label>Tv</label><input type="radio" name="radioItem1" value="Tv">
	<input type="submit">
</form>
<%-- <c:set var="itemRadio" value="${radioItem} + ${radioItem1}" scope="session"/> --%>
<%
	if(request.getParameter("radioItem1") != null){
	String cart = request.getParameter("radioItem1");
// 	out.println(cart);
	cart += ", " + (String) session.getAttribute("cart");
// 	out.println(cart);
	session.setAttribute("cart", cart);
	out.println(cart);
	}
// 	request.getRequestURI();
// 	session.setAttribute("cart", ((String) session.getAttribute("cart") + request.getParameter("radioItem1")));
%>
<a href="foodItems.jsp">Go to food</a>
</body>
</html>