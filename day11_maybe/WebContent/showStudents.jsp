<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students</title>
</head>
<body>
<ol>
	<c:forEach items="${sessionScope.studentList}" var="student">
		<li><a href='<c:url value="process"> <c:param name="tempStudent" value="${student.studentName}"/> </c:url>'>${student}</a></li>
	</c:forEach>
</ol>
<%@ include file="testfile.jsp" %>
</body>
</html>