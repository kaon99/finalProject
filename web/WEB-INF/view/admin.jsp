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
    <title>Title</title>
</head>
<body>

<form role="form" method="post"
      action="${pageContext.request.contextPath}/view/setmarks">
    <input type="hidden" name="conference_id" value="${conference.id}">
    <button type="submit" >Регистрация</button>
</form>

<form role="form"  method="post"
      action="${pageContext.request.contextPath}/view/sendnotification">
    <input type="hidden" name="conference_id" value="${conference.id}">
    <button type="submit" >Регистрация</button>
</form>
<form role="form"  method="post"
      action="${pageContext.request.contextPath}/view/sendnotification">
    <input type="hidden" name="conference_id" value="${conference.id}">
    <button type="submit" >Регистрация</button>
</form>

</body>
</html>
