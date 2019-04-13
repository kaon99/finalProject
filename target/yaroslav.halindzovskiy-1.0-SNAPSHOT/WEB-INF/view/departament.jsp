<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<fmt:setBundle basename="text"/>
<%--
  Created by IntelliJ IDEA.
  User: Yaroslav
  Date: 02.04.2019
  Time: 1:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><fmt:message key="text.departament"/> </title>
</head>
<body>
<h1><fmt:message key="text.departament"/></h1>
<form method="post"
      action="${pageContext.request.contextPath}/university/logout">
    <input type="hidden">
    <button type="submit"><fmt:message key="text.logout"/></button>
</form>
</body>
</html>
