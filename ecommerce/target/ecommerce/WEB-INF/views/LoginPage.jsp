<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN</title>
</head>
<body style="background-color:#b25942">
<center>
<h1><font color="#fcd2c7">LOGIN...</font></h1>
<form action="<c:url value='/j_spring_security_check' />" method="post" style="border:5px black solid;background-color:#fcd2c7;border-radius:15px;width:300px;padding:10px 10px 10px 30px;margin-top:20px">
   <table>
   <tbody>
   <tr><td>
   UserName: </td><td><input type="text" name="j_name" placeholder="username"></td></tr>
  <tr><td> password: </td><td><input type="text" name="j_password" placeholder="password"></td></tr>
   </tbody>
   </table>
   <table> 	
  <tr><td><input type="submit" value="LOGIN"></td><td><input type="reset" value="CANCEL"></td></tr>
   </table>
   
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
   
</form>
</center>
</body>
</html>