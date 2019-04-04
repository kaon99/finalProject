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
<h1>Вы вышли</h1>

<form  method="post"
action="${pageContext.request.contextPath}/view/login">
<input type="hidden">
<button type="submit" ></button>
</form>
</body>
</html>
