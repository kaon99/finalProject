%--
  Created by IntelliJ IDEA.
  User: Yaroslav
  Date: 04.04.2019
  Time: 0:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LogOut</title>
</head>
<body>
<h1>Вы вышли из Аккаунта!</h1>
<form method="post"
      action="${pageContext.request.contextPath}/university/login">
    <input type="hidden">
    <button type="submit">Войти</button>
</form>
</body>
</html>
