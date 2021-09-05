<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <fieldset>
 <legend>Login Form</legend>
 <form action="./authenticate" method="post">
 <table>
 <tr>


  <td>password</td>
 <td>:</td>
 <td><input type="password" name="password" required="required"></td>
 </tr>
 <td>submit</td>
 <td>:</td>
 <td><input type="submit" name="login" ></td>
 </tr>
 
 </table>
 </form>
 
 </fieldset>
</body>
</html>