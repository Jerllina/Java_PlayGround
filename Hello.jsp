<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hi~~^ ^</title>
</head>
<body>
<h1>Hello World!</h1>
<%
out.println("Your IP address is " +request.getRemoteAddr()+"<br/>");
out.println("Your user agent is " +request.getHeader("user-agent")+"<br/>");
%>
</body>
</html>