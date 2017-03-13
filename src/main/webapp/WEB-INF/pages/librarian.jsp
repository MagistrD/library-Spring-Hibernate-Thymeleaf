<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Librarian</title>
    <link href="../../css/bootstrap.css" rel="stylesheet">

</head>
<body>

<c:if test="${pageContext.request.userPrincipal.name != null}">
    <form id="logoutForm" method="post" action="${contextPath}/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
    <h2>Librarian Page ${pageContext.request.userPrincipal.name} | <a
            onclick="document.forms['logoutForm'].submit()">Logout</a>
    </h2>
</c:if>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/bootstrap.min.js"></script>
</body>
</html>
