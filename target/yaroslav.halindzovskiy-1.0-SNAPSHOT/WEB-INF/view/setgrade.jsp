<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    <title><fmt:message key="text.set.marks"/></title>
</head>
<body>
<div>
    <form>

        <p>
            <label>
                <input class="w3-input" type="text" required placeholder="<fmt:message key="text.setmarks.email"/>"
                       name="student.email"/>
            </label>
        </p>
        <p>
            <label>
                <input class="w3-input" type="text" required placeholder="<fmt:message key="text.setmarks.subject"/>"
                       name="student.subject"/>
            </label>
        </p>
        <p>
            <label>
                <input class="w3-input" type="text" required placeholder="<fmt:message key="text.setmarks.assessment"/>"
                       name="student.subject"/>
            </label>
        </p>
    </form>


</div>


<form method="post"
      action="${pageContext.request.contextPath}/university/logout">
    <input type="hidden">
    <button type="submit"><fmt:message key="text.logout"/></button>
</form>
</body>
</html>
