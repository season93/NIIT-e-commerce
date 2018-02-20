<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>ALL PRODUCTS</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>

</head>
<body style="background-color:#aef2ce"><center>
  <div class="container" >
         <div ng-app="MyApp" ng-controller="ProductsList">
               <table class="g table-hover table-bordered" style="border:5px black solid;border-radius:15px;padding:10px 10px 10px 10px;margin-top:20px;width:250px" >
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
                 <td><a class="btn btn-info" href="EditProduct?id={{x.id}}">edit</a></td>
                 <td><a class="btn btn-info" onclick="alert('PRODUCT SUCCESSFULLY DELETED')" href="DeleteProduct?id={{x.id}}">delete</a></td>
                 </tr>
                 </br>
               
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