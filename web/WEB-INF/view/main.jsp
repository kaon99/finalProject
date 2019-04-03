<%--
  Created by IntelliJ IDEA.
  User: Yaroslav
  Date: 03.04.2019
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
<h1>Главная страница</h1>

<form role="form" class="btn btn-success btn-sm" method="post"
action="${pageContext.request.contextPath}/view/login">
<input type="hidden" name="conference_id" value="${conference.id}">
<button type="submit" class="btn btn-success btn-sm">Войти</button>
</form>
</body>
</html>
