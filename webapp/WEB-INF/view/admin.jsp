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
      action="${pageContext.request.contextPath}/university/admin/setmarks">
    <input type="hidden" name="conference_id" value="${conference.id}">
    <button type="submit" >Выставить оценки</button>
</form>

<form role="form"  method="post"
      action="${pageContext.request.contextPath}/university/admin/sendnotification">
    <button type="submit" >Отправить уведомление</button>
</form>

<form method="post"
      action="${pageContext.request.contextPath}/logout.jsp">
    <input type="hidden">
    <button type="submit">Выйти</button>
</form>
</body>
</html>
