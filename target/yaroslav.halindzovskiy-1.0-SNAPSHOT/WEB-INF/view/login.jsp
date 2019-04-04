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

    <form method="post"
          action="${pageContext.request.contextPath}/view/registration">
        <input type="hidden">
        <button type="submit">Регистрация</button>
    </form>

    <form method="post"
          action="${pageContext.request.contextPath}/view/admin">
        <input type="hidden">
        <button type="submit">Войти как админ</button>
    </form>
    <form method="post"
          action="${pageContext.request.contextPath}/view/studentpage">
        <input type="hidden">
        <button type="submit">Войти как студент</button>
    </form>
</div>
</body>
</html>
