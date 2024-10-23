<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
<%--    <spring:message code="loginName" />--%>
    LoginName：<input type="text" name="username"><br>
密码：<input type="password" name="password"><br>
<input type="submit" value="登录">
</form>
</body>
</html>