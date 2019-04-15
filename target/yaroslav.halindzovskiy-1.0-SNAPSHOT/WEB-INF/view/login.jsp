<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fmt:setBundle basename="text"/>
<%--
  Created by IntelliJ IDEA.
  User: Yaroslav
  Date: 02.04.2019
  Time: 1:45
  To change this template use File | Settings | File Templates.
--%><fmt:setBundle basename="text"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><fmt:message key="text.title"/></title>
</head>
<body>


<div>
    <h2><fmt:message key="text.enter.login.and.password"/></h2>
    <form action="${pageContext.request.contextPath}/university/login" method="post">
        <fmt:message key="text.login"/> <input type="text" name="login" required="required"/>
        <fmt:message key="text.password"/> <input type="text" name="password" required="required"/>
        <input type="submit" value=
        <fmt:message key="text.enter"/>>

        <c:if test="${requestScope.notFound}">
            <div class="w3-container">
                <fmt:message key="text.invalidData"/>
            </div>
        </c:if>

    </form>
</div>
<div>
    <form action="${pageContext.request.contextPath}/university/registration" method="post">
        <input type="submit" value= <fmt:message key="text.registration"/>>
    </form>
</div>


</body>
</html>
