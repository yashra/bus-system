<%@page import="com.cg.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>You Profile Data:</h1>
	<jsp:include page="/index.jsp"/>
	<%
		User u=(User)session.getAttribute("user");
		if(u==null)
		{
	%>
	<h3>Please Login To View the profile</h3>
	<%
		}
		else
		{
	%>
	<table border="1">
		<tr><th>UserID</th><th>UserName</th><th>Password</th><th>UserType</th></tr>
		<tr><td>${user.userId}</td><td>${user.userName}</td><td>${user.password}</td><td>${user.userType}</td>
	</table>
	<a href="update"> Update Password</a>
	<h1>${message}</h1>
	<%} %>
</body>
</html>