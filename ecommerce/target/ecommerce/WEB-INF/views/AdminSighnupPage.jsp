<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SIGN UP</title>
</head>
<body style="background-color:#68754f">
<center>
  <h2 style="color:#eaf9cc"><b><i> Please Enter your valid details and submit </i></b></h2>
    <form:form action="AdminLogin" method="post" modelAttribute="admin" style="border:5px black solid;background-color:#eaf9cc;border-radius:10px;padding:10px 10px 10px 10px;margin-top:20px;width:320px;;height=1000px">
       <table>
           <tr><td><form:label path="adminname">UserName:</form:label></td>
           <td><form:input path="adminname" placeholder="username"/></td></tr>
            <tr><td><form:label path="role">ROLE:</form:label></td>
          <td><form:input path="role" pathholder="user/admin"></form:input></td></tr>
           <tr><td><form:label path="password">Password:</form:label></td>
           <td><form:input type="password" path="password" placeholder="password"/></td></tr>
           <tr><td><form:label path="birthdate">DOB:</form:label></td>
           <td><form:input type="date" path="birthdate" placeholder="dd/mm/yyrr"/></td></tr>
           <tr><td><form:label type="email" path="email">EMAIL:</form:label></td>
           <td><form:input path="email"  placeholder="email"/></td></tr>
           <tr><td><form:label path="mobile_number">Mobile:</form:label></td>
           <td><form:input type="number" path="mobile_number" placeholder="+91"/></td></tr>
          <tr><td><form:label path="address"> Address:</form:label></td>
         <td><form:textarea rows="5" cols="15" path="address"  class="addressfield"/> 
          <tr><td><form:label path="gender"> gender:</form:label></td>
         <td>male<form:radiobutton path="gender" value="male"/>
         female<form:radiobutton  path="gender" value="female"/>
         other<form:radiobutton  path="gender" value="other"/></td></tr>
       </table>
       <table>
         <tr><td> <input type="submit" value="SUBMIT"/></td><td> <input type="reset" value="CANCEL"/></td></tr>
         </table>
       </form:form>
       </center>
</body>
</html>