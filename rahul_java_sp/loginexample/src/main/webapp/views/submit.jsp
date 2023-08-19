<%@page import="org.springframework.boot.web.client.ClientHttpRequestFactorySettings"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Submitted successfully</h1>

<%  String name= request.getParameter("uname"); %>
<h1 style="color:red">

<% out.println("Welcome "+name); %>
</h1>
</body>
</html>