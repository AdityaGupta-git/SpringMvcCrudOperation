<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>

</head>
<body>
 
<form action="addProductForm" method="post">
  <div class="form-group">
    <label for="inputName">Name</label>
    <input type="text" class="form-control" id="inputName" aria-describedby="emailHelp" placeholder="Name " name="NAME">
  </div>
  <div class="form-group">
    <label for="description">Description</label>
    <input type="text" class="form-control" id="description" placeholder="Description" name="DESCRIPTION">
  </div>
  <div class="form-group">
    <label for="price">Price</label>
    <input type="number" class="form-control" id="price" placeholder="Price" name="PRICE">
  </div>
 <a href="${pageContext.request.contextPath}/" class="btn btn-secondary">Back</a>
 <!-- <a href="SubmitPage" class="btn btn-success">Submit</a> -->
 <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>