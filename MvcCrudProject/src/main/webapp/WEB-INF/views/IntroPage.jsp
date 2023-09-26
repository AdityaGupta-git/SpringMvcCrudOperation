<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>
</head>
<body>
<center> 
<form action="IntroPage">
  <div class="form-group">
	<center>
  </div>
  
  <table class="table">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
		<c:forEach items="${productList}" var="item">
			<tr>
				<td> ${item.ID} </td> 
				<td> ${item.NAME}</td> 
				<td>  ${item.DESCRIPTION}</td> 
				<td style="font-weight: bold">  &#8377; ${item.PRICE}</td> 
				<td>
					<a href="delete_product/${item.ID }"><i class="fas fa-trash text-danger"></i></a>
					<a href="update_product/${item.ID }"><i class="fas fa-pen"></i></a>
				</td>
			</tr>
		</c:forEach>
  </tbody>
</table>

  <a href="addProduct" class="btn btn-primary">Click Here</a>
</form>
</center>
</body>
</html>