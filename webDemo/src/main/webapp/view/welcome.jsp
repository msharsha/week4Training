<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome <%=session.getAttribute("uname") %></h1>
<h1>Welcome ${ uname }</h1>
<h1>Your password is ${ pass }</h1>
</body>
</html>