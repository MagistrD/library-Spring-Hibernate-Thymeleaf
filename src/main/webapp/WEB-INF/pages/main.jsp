<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="ru_RU" scope="session"/>
<html>
<head>
    <title>Main</title>
    <link type="text/css" rel="stylesheet" href="/css/bootstrap.css"/>
</head>
<body>
<ul class="nav nav-tabs">
    <li><a href="/users">All users</a></li>
    <li><a href="/books">All books</a></li>
    <li><a href="/registration">Registration</a></li>
</ul>
<h1>Hello, user</h1>
</body>
</html>