<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>

<%@ page session="false" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books</title>
    <link type="text/css" rel="stylesheet" href="../../css/bootstrap.css"/>
</head>
<body>

<spring:url value="/book-history" var="bookhistory"/>

<h1>Your books: </h1>

<table class="table table-hover">
    <thead>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>
        <th>User</th>
        <th>History</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${userBooks}" var="book" varStatus="status">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.user.name} ${book.user.surname}</td>
            <td><a href="${bookhistory}/${book.id}">Book history</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
