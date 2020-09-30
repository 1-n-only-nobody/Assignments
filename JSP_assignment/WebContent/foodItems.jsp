<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="bill.jsp">Go to Bill</a>
<%-- <h2> <%= request.getParameter("radioItem1") %> </h2> --%>
<c:out value="${itemRadio }"></c:out>
<form action="" method="get">
	<label>Thepla</label><input type="radio" name="radioItem2" value="thepla">
	<label>Cake</label><input type="radio" name="radioItem2" value="cake">
	<label>Rice</label><input type="radio" name="radioItem2" value="rice">
	<input type="submit">
</form>
<%
	if(request.getParameter("radioItem2") != null){
	String cart = request.getParameter("radioItem2");
// 	out.println(cart);
	cart += ", " + (String) session.getAttribute("cart");
// 	out.println(cart);
	session.setAttribute("cart", cart);
	out.println(cart);
	}
%>
</body>
</html>