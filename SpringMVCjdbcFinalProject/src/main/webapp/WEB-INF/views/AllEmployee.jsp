<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
   
<%@ page isELIgnored="false" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

Below are all your superheros:<br>

${my_Message}<br>

<c:forEach var="heros" items="${All_SuperHeros}">
	${heros}<br>
</c:forEach>



</body>
</html>