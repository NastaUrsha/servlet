<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<div class="container">
	<p style="font-style:italic">Name ${requestScope.item.name}</p>
	<img src="http://i1.hdslb.com/bfs/archive/b0ece36b53b19a4e4b6fb8becda67a98d90eabea.jpg" width = "300" alt="">
	<p style="font-style:italic">Description ${requestScope.item.description}</p>
	<p style="font-style:italic">Price ${requestScope.item.price}</>

	<form action="/basket" method="post">
		<input type="hidden" name="id" value="${requestScope.item.id}">
		<button>Add</button>
	</form>
</div>
</body>
</html>
