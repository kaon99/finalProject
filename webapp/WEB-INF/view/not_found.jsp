<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<fmt:setBundle basename="text"/>
<%--
  Created by IntelliJ IDEA.
  User: Yaroslav
  Date: 02.04.2019
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error 404</title>

</head>
<body>
<form method="post"
      action="${pageContext.request.contextPath}/university/main">
    <input type="hidden">
    <button type="submit"><fmt:message key="text.main"/></button>
</form>
</body>
</html>
