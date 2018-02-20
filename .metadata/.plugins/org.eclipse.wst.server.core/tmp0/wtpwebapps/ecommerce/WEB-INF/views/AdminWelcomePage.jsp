<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>  
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr{background-color:#e0fcfb}

th {
    background-color:#00465b;
    color: white;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WELCOME</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
</head>
<body style="background-color:#aef2ce">
  <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="Admin">Niit-E-Commerse</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Categories<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="ToysProducts">Toys</a></li>
          <li><a href="BooksProducts">Books</a></li>
          <li><a href="Mobile&LaptopsProducts">Mobile&Laptops</a></li>
        </ul>
      </li>
     
      <li><a href="AddProductPage">AddProduct</a></li>
      
     
    </ul>
  </div>
</nav>
           
<center>
  <div class="container" ">
         <div ng-app="MyApp" ng-controller="ProductsList">
               <table class="g table-hover table-bordered" style="border:1px #e0fcfb;border-radius:15px;padding:10px 10px 10px 10px;margin-top:20px;width:250px" >
                 <tr>
                 <th><h3><u><b>ProductName</b></u></h3></th>
                 <th><h3><u><b>Categorytype</b></u></h3></th>
                 <th><h3><u><b>Description</b></u></h3></th>
                 <th><h3><u><b>price</b></u></h3></th>
                 <th><h3><u><b>Units</b></u></h3></th>
                 <th><h3><u><b>Manufacturer</b></u></h3></th>
                 <th><h3><u><b>Image</b></u></h3></th>
                 </tr>
                 <tr ng-repeat="x in products">
                 <td>{{x.productname}}</td>
                 <td>{{x.categorytype}}</td>
                 <td>{{x.description}}</td>
                 <td>{{x.price}}</td>
                 <td>{{x.units}}</td>
                 <td>{{x.manufacturer}}</td>
                 <td><img src="<c:url value="/resources/images/{{x.productId}}.jpg"/>"width="100" height="100"></td>
                 <td><a class="btn btn-info" href="EditProduct?id={{x.productId}}">edit</a></td>
                 <td><a class="btn btn-info" onclick="alert('PRODUCT SUCCESSFULLY DELETED')" href="DeleteProduct?id={{x.productId}}">delete</a></td>
                 </tr>
             
               
               </table>
         </div>
  </div></center>
 <script>
var app = angular.module('MyApp', []);
app.controller('ProductsList', function($scope, $http) {
    $http.get("List")
    .then(function (response) {$scope.products = response.data;});
});
</script>
       
</body>
</html>