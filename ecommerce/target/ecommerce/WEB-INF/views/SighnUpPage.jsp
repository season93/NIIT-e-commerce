<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SIGN UP</title>
</head>
<body style="background-color:#68754f"><center>
<h1><font color="#eaf9cc">SIGN UP...</font></h1>
     <form:form action="WelcomeUser" method="post" modelAttribute="user" style="border:5px black solid;background-color:#eaf9cc;border-radius:15px;width:400px;padding:10px 15px 25px 30px;margin-top:20px">
     <table>
      <tr><td><form:label path="username">UserName:</form:label></td>
         <td><form:input path="username"  placeholder="username"></form:input></td></tr>
         <tr><td><form:label path="role">ROLE:</form:label></td>
          <td><form:input path="role" pathholder="user/admin"></form:input></td></tr>
         <tr><td><form:label path="password"> Password:</form:label></td>
         <td><form:input type="password" path="password" placeholder="password"/></td></tr>
         <tr><td><form:label path="email"> Email:</form:label></td>
         <td><form:input type="email" path="email" placeholder="email"/></td></tr>
         <tr><td><form:label path="birthdate"> DOB:</form:label></td>
         <td><form:input type="date" path="birthdate" placeholder="DD/MM/YY"/></td></tr>
         <tr><td><form:label path="mobile_number"> Mobile:</form:label></td>
         <td><form:input type="text" path="mobile_number" placeholder="+91"/></td></tr>
         <tr><td><form:label path="address"> Address:</form:label></td>
         <td><form:textarea rows="5" cols="15" path="address"  class="addressfield"/> 
         </td></tr>
         <tr><td><form:label path="gender"> gender:</form:label></td>
         <td>male<form:radiobutton  path="gender" value="male"/>
         female<form:radiobutton  path="gender" value="female"/>
         other<form:radiobutton  path="gender" value="other"/></td></tr>
         <tr><td><form:label path="occupation"> Occupation:</form:label></td>
         <td><form:select path="occupation" >
          <form:option value="student" >student</form:option>
          <form:option value="employee" >employee</form:option>
          <form:option value="business" >business</form:option>
          <form:option value="homemaker" >homemaker</form:option></form:select>
        </td></tr>
         <tr>
         <td colspan="2" align:"center"><input type="checkbox" name="value"><a href="AcceptTerms.jsp" class="Link">
         accept terms and conditions</a> </td></tr>
         
  
  
         <td><input type="submit" value="submit" ></td>
         <td><input type="reset" value="reset"></td></tr>
     </table>
     
     </form:form></center>
</body>
</html>