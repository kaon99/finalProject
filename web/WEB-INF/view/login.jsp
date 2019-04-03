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
    <title>Это страница логина</title>
</head>
<body>
<h1> Работает</h1>

<div class="menu-bar">

    <form role="form" class="btn btn-success btn-sm" method="post"
          action="${pageContext.request.contextPath}/view/registration">
        <input type="hidden" name="conference_id" value="${conference.id}">
        <button type="submit" class="btn btn-success btn-sm">Регистрация</button>
    </form>

    <form role="form" class="btn btn-success btn-sm" method="post"
          action="${pageContext.request.contextPath}/view/main">
        <input type="hidden" name="conference_id" value="${conference.id}">
        <button type="submit" class="btn btn-success btn-sm">Войти</button>
    </form>
</div>
</body>
</html>
