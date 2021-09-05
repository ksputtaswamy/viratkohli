<%@page import="com.technoelevate.employeedto.EmployeeDTO" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
  <% 
  EmployeeDTO sid=(EmployeeDTO)request.getAttribute("emps");
  String msg=(String)request.getAttribute("msg");
  %>
<body>
<%=msg %>
<h1>Welcome </h1><%=sid.getUser() %>
</body>
</html>