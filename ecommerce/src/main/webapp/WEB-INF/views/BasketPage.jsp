<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
</head>
<body>
          <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="LandingPage.jsp">Niit-E-Commerse</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="LandingPage.jsp">UserHome</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Categories<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="ToysProducts">Toys</a></li>
          <li><a href=BooksProducts">Books</a></li>
          <li><a href="Mobile&LaptopsProducts">Mobile&Laptops</a></li>
        </ul>
      </li>
      
      <li><a href="#">profile</a></li>
      </ul>
  </div>
  </nav>
   <div class="container">
          
               <table class="g table-hover table-bordered">
                 <tr>
                 <th>ProductName</th>
                 <th>Categorytype</th>
                 <th>Description</th>
                 <th>price</th>
                 <th>Manufacturer</th>
                 </tr>
                 <c:forEach items="cartitems" val="x">
                 <tr>
                 <td>{{x.getProduct().productname}}</td>
                 <td>{{x.getProduct().categorytype}}</td>
                 <td>{{x.getProduct().description}}</td>
                 <td>{{x.getProduct().Price}}</td>
                 <td>{{x.getProduct().manufacturer}}</td>
                 <td><a class="btn btn-info" href="DeleteCartItem?id={{x.getBasket()}}">DELETE</a>
                 </tr>
                 </c:forEach>
                 
               </table>
         </div>


<!--  <script>
var app = angular.module('myApp', []);
app.controller('ProductsList', function($scope, $http) {
    $http.get("BasketList")
    .then(function (response) {$scope.products = response.data;});
});
</script> -->
</body>
</html>