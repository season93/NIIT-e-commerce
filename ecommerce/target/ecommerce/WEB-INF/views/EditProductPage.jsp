<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>  
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EDIT PRODUCT</title>
 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
</head>
<body style="background-color:#b7600b">
       
       <center>
        <h2><font color="#fcdcbd">Add your product details</font></h2>
      
      
        <form:form action="ProductDetails" method="post" modelAttribute="product"  style="border:5px black solid;background-color:#fcdcbd;border-radius:10px;padding:15px 15px 15px 15px;width:350px;height=500px; ">
              
                 <form:hidden path="productId"/>
            <table>
              <tr>
                 <spring:bind path="categorytype">
                 <td><form:label path="categorytype">Category:</form:label>
                 <td><form:select path="categorytype">
                 <form:option value="${editproduct.categorytype}">${editproduct.categorytype}</form:option>
                 <form:option value="Toys">Toys</form:option>
                 <form:option value="Books">Books</form:option>
                 <form:option value="Laptops">Laptop</form:option></form:select></td></spring:bind></tr>
              <tr><spring:bind path="productname">
              <td><form:label path="productname">ProductName:</form:label></td>
              <td><form:input type="text" path="productname" id="productname"/> </td></spring:bind></tr>
                 
              <tr><spring:bind path="description"><td><form:label path="description">Description:</form:label></td>
              <td><form:textarea path="description" rows="5" cols="30" id="description"/></td></spring:bind></tr>
               <tr><spring:bind path="units"><td><form:label path="units">TotalUnits:</form:label></td>
              <td><form:input type="number" path="units" id="units"/> </td></spring:bind></tr>
               <tr><spring:bind path="manufacturer"><td><form:label path="manufacturer">Manufacturer:</form:label></td>
              <td><form:input type="text" path="manufacturer" id="manufacturer"/> </td></spring:bind></tr>
               <tr><spring:bind path="price"><td><form:label path="price">Price:</form:label></td>
              <td><form:input type="text" path="price" id="price"/> </td></spring:bind>/</tr>
            </table>
            <table>
               <tr><td><input type="submit" onclick="alert('PRODUCT SUCCESSFULLY UPDATED')" value="SUBMIT" /></td><td><input type="reset" value="CANCEL" /></td></tr>
            </table>
        </form:form>
        </center>
        </div>
  
</body>
</html>