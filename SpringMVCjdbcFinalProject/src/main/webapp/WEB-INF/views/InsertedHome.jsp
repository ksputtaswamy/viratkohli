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
  EmployeeDTO dto=(EmployeeDTO)request.getAttribute("AddEmp");
  String msg=(String)request.getAttribute("msg");
  %>
<body>
empId=<%=dto.getEmpId() %> <br> <br>
user=<%=dto.getUser() %> <br> <br>
password=<%=dto.getPassword() %>

</body>
</html>