<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<fmt:setBundle basename="text"/>
<%--
  Created by IntelliJ IDEA.
  User: Yaroslav
  Date: 16.04.2019
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<li><a href="${pageContext.request.contextPath}/university/main"><fmt:message key="text.main"/></a></li>
<li><a href="${pageContext.request.contextPath}/university/logout"><fmt:message key="text.logout"/></a></li>
</body>
</html>
