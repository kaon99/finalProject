<%--
  Created by IntelliJ IDEA.
  User: Yaroslav
  Date: 02.04.2019
  Time: 1:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>
</head>
<body>
<h1>Student Page</h1>
<form method="post"
      action="${pageContext.request.contextPath}/view/departament">
    <input type="hidden">
    <button type="submit">Кафедры</button>
</form>

<form method="post"
      action="${pageContext.request.contextPath}/view/studentrating">
    <input type="hidden">
    <button type="submit">Показать рейтинг</button>
</form>
<form method="post"
      action="${pageContext.request.contextPath}/logout.jsp">
    <input type="hidden">
    <button type="submit">Выйти</button>
</form>
</body>
</html>
