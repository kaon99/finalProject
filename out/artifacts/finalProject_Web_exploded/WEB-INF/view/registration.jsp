<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<fmt:setBundle basename="text"/>
<%--
  Created by IntelliJ IDEA.
  User: Yaroslav
  Date: 02.04.2019
  Time: 1:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>регистрация</title>
</head>
<body>

    <form class="w3-container" action="${pageContext.request.contextPath}/university/login" align="center"  method="post">
    <p>
        <label>
            <input class="w3-input" type="text" required placeholder= "<fmt:message key="text.name.ua"/>" name="nameUa"/>
        </label>
    </p>
    <p>
        <label>
            <input class="w3-input" type="text" required placeholder="<fmt:message key="text.surname.ua"/>" name="surnameUa"/>
        </label>
    </p>
    <p>
        <label>
            <input class="w3-input" type="text" required placeholder="<fmt:message key="text.name.en"/>" name="nameEn"/>
        </label>
    </p>
    <p>
        <label>
            <input class="w3-input" type="text" required placeholder="<fmt:message key="text.surname.en"/>" name="surnameEn"/>
        </label>
    </p>
    <p>
        <label>
            <input class="w3-input" type="text" required placeholder="<fmt:message key="text.email"/>" name="email"/>
        </label>
    </p>
    <p>
        <label>
            <input class="w3-input" type="password" required placeholder="<fmt:message key="text.password"/>" name="password"/>
        </label>
    </p>
        <div>
            <input class="w3-button w3-green" type="submit" value="<fmt:message key="text.registration"/>">
<%--            <c:if test="${requestScope.registrationError}">--%>
<%--            <div class="w3-container">--%>
<%--                <fmt:message key="text.rerisration.error"/>--%>
<%--            </div>--%>
<%--            </c:if>--%>
    </form>
</div>

</body>
</html>


