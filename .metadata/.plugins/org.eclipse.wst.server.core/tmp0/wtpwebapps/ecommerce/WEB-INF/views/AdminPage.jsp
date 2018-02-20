<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SIGN UP / LOGIN</title>
</head>
<body style="background-color:#b25942">
<center>
       <div style=" background-color:#fcd2c7 ">
      <h2 style="color:#b25942">New Admin-: then Signup below</h2>
       <button onclick="window.location='AdminSighnupPage'">SIGN UP</button>
       
       </div>
       
       <h2 style="color:#fcd2c7">Existing Admin</h2>
     <form action="season" method="post"  style="border:5px black solid;background-color:#fcd2c7;border-radius:15px;width:300px;padding:10px 10px 10px 30px;margin-top:20px">
       <table>
           <tr><td>AdminName:</td>
              <td><input type="text" name="adminname" pathholder="user_name"/></td></tr>
              <tr><td>Password:</td>
              <td><input type="password" name="password" /></td></tr>
      </table>
      <table>
             <tr><td><input type="submit" value="LOGIN"/></td><td><input type="reset" value="CANCEL"/></td></tr>
      </table>
     </form>
     </center>
</body>
</html>