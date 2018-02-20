<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
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
<title>TOYS</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
</head>
<body style="background-color:#aef2ce">
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
      </ul>
      <ul class="nav navbar-nav navbar-right">
      <li><a href="OpenBasket"><span class="glyphicon glyphicon-shopping-cart"></span> Basket</a></li>
      <li><a href="Profile">Profile</a></li>
    </ul>
  </div>
  </nav>
   <div class="container">
         <div ng-app="myApp" ng-controller="ProductsList">
               <table class="g table-hover table-bordered">
                 <tr>
                 <th><h3><u><b>ProductName</b></u></h3></th>
                 <th><h3><u><b>Categorytype</b></u></h3></th>
                 <th><h3><u><b>Description</b></u></h3></th>
                 <th><h3><u><b>price</b></u></h3></th>
                 <th><h3><u><b>Units</b></u></h3></th>
                 <th><h3><u><b>Manufacturer</b></u></h3></th>
                 </tr>
                 <tr ng-repeat="x in products">
                 <td>{{x.productname}}</td>
                 <td>{{x.categorytype}}</td>
                 <td>{{x.description}}</td>
                 <td>{{x.price}}</td>
                 <td>{{x.units}}</td>
                 <td>{{x.manufacturer}}</td>
                 <td><a class="btn btn-info" onclick="alert('PRODUCT SUCCESSFULLY ADDED TO CART')" href="AddToCart?id={{x.productId}} ">ADDTOCART</a></td>
                 <td><a class="btn btn-info" href="Buy?id={{x.productId}}" >BUY</a></td>
                 </tr>
                 
               
               </table>
         </div>
  </div>
 <script>
var app = angular.module('myApp', []);
app.controller('ProductsList', function($scope, $http) {
    $http.get("Mobile&LaptopsList")
    .then(function (response) {$scope.products = response.data;});
});
</script>
</body>
</html>