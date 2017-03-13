<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>History of book</title>
    <link type="text/css" rel="stylesheet" href="../../css/bootstrap.css"/>
</head>
<body>

<h1>History of book</h1>

<table class="table table-hover">
    <thead>
    <tr>
        <th>ID</th>
        <th>Date of issue</th>
        <th>Date of return</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${bookHistory}" var="history" varStatus="status">
        <tr>
            <td>${history.id}</td>
            <td>${history.dateOfIssue}</td>
            <td>${history.dateOfReturn}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
