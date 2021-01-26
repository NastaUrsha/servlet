<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>Account</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<div class="container">
	<p>Account</p>
	<br>
	<p>Name ${sessionScope.user.name}</p>
	<br>
	<p>Basket</p>
	<br>
	<ul>
		<c:forEach items="${sessionScope.basket.getAll()}" var="item">
			<li>${item.name}</li>
		</c:forEach>
	</ul>
	<img src="http://i1.hdslb.com/bfs/archive/b0ece36b53b19a4e4b6fb8becda67a98d90eabea.jpg" width = "500" alt="">


</div>
</body>
</html>
