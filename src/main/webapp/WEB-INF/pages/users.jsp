<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>

<script src="/js/bootstrap.js"></script>

<spring:url value="/user-books" var="userbooks"/>

<h1>Users</h1>

<table class="table table-hover ">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Username</th>
        <th>Books</th>
        <%--<th>Password</th>--%>
        <%--<th>UserType</th>--%>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user" varStatus="status">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.surname}</td>
            <td>${user.username}</td>
            <%--<td>${user.}</td>--%>
            <td><a href="${userbooks}/${user.id}">User's books</a></td>
            <%--<td><a href="<c:url value='/user-books/${user.id}'/>">User's Books</a></td>--%>
                <%--<td><a href="">User's Books</a></td>--%>

        </tr>
    </c:forEach>
    </tbody>

</table>
</body>
</html>
