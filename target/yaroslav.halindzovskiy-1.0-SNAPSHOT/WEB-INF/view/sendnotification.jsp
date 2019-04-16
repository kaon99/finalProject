<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<fmt:setBundle basename="text"/>
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
    <jsp:include page="/WEB-INF/parts/header.jsp"/>
    <title><fmt:message key="text.send.notification"/></title>
</head>
<body>
<h1><fmt:message key="text.send.notification"/> </h1>

<form method="post"
      action="${pageContext.request.contextPath}/university/admin/sendnotification/send">
    <p>
        <label>
            <input class="w3-input" type="text" required placeholder="<fmt:message key="text.email"/>" name="email"/>
        </label>
    </p>
    <button type="submit"><fmt:message key="text.send"/></button>
</form>
</body>
</html>