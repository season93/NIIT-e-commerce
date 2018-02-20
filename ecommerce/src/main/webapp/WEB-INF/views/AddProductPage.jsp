<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>  
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD PRODUCT</title>
</head>
<body style="background-color:#b7600b">
       <center>
        <h2><font color="#fcdcbd">Add your product details</font></h2>
        
        <form:form action="ProductDetails" method="post" modelAttribute="product" enctype="multipart/form-data" style="border:5px black solid;background-color:#fcdcbd;border-radius:10px;padding:15px 15px 15px 15px;width:350px;height=500px; ">
           
            <table>
              <tr>
                 <td><form:label path="categorytype">Category:</form:label>
                 <td><form:select path="categorytype">
                 <form:option value="none">select</form:option>
                 <form:option value="Toys">Toys</form:option>
                 <form:option value="Books">Books</form:option>
                 <form:option value="Laptops">Laptop</form:option></form:select></td></tr>
              <tr><td><form:label path="productname">ProductName:</form:label></td>
              <td><form:input type="text" path="productname" placeholder="Prodcutname"/> </td></tr>
                 
              <tr><td><form:label path="description">Description:</form:label></td>
              <td><form:textarea path="description" rows="5" cols="30" placeholder="tell about the product"/></td></tr>
               <tr><td><form:label path="units">TotalUnits:</form:label></td>
              <td><form:input type="number" path="units" placeholder="Units"/> </td></tr>
               <tr><td><form:label path="manufacturer">Manufacturer:</form:label></td>
              <td><form:input type="text" path="manufacturer" placeholder="manufacturer"/> </td></tr>
               <tr><td><form:label path="price">Price:</form:label></td>
              <td><form:input type="text" path="price" placeholder="prise"/> </td></tr>
              
              <tr><td>UploadImage:</td>
              <td><input type="file" name="image" size="50" /></td></tr>
               <tr><td><input type="submit" onclick="alert('PRODUCT SUCCESSFULLY ADDED')" value="submit" /></td></tr>
            </table>
        </form:form>
        </center>
</body>
</html>