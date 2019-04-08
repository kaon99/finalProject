<%--
  Created by IntelliJ IDEA.
  User: Yaroslav
  Date: 01.04.2019
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Main Page </title>
  </head>
  <body>
  <form method="post"
        action="${pageContext.request.contextPath}/university/registration">
    <input type="hidden">
    <button type="submit">Регистрация</button>
  </form>
  <form method="post"
        action="${pageContext.request.contextPath}/university/login">
    <input type="hidden">
    <button type="submit">Войти</button>
  </form>

  </body>
</html>
