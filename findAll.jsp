<%--<%@ page import="java.util.List" %>--%>
<%--<%@ page import="by.tms.model.User" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>Find All</title>
</head>
<body>

<h3>All users <span class="badge bg-secondary">=)</span></h3>
<jsp:include page="_header.jsp"/>
<p style="font-family:fantasy;">Name or Fack Name</p>
<div class="container">
	<ul>
		<c:forEach items="${requestScope.users}" var="user">
			<li><p style="font-style:italic">${user.name}</li>
		</c:forEach>
	</ul>
</div>
</body>
</html>
