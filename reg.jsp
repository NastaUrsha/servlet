<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Registration</title>
</head>
<body>

<jsp:include page="_header.jsp"/>
<div class="container">
	<form action="/reg" method="post">
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Name</label>
			<input type="text" value="${requestScope.oldName}" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
		</div>
		<div class="mb-3">
			<label for="exampleInputEmail2" class="form-label">Login</label>
			<input type="text" value="${requestScope.oldLogin}" name="login" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp">
			<div id="emailHelp" class="form-text">${requestScope.message}</div>
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Password</label>
			<input type="password" value="${requestScope.oldPassword}" name="password" class="form-control" id="exampleInputPassword1">
		</div>
		<button type="submit" class="btn btn-dark">Registration</button>
	</form>
</div>
</body>
</html>
