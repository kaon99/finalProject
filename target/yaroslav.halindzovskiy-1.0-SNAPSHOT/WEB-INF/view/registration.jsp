<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

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

    <form class="w3-container" align="center" method="post">
    <p>
        <label>
            <input class="w3-input" type="text" required placeholder="" name="nameUa"/>
        </label>
    </p>
    <p>
        <label>
            <input class="w3-input" type="text" required placeholder="" name="surnameUa"/>
        </label>
    </p>
    <p>
        <label>
            <input class="w3-input" type="text" required placeholder="" name="nameEn"/>
        </label>
    </p>
    <p>
        <label>
            <input class="w3-input" type="text" required placeholder="" name="surnameEn"/>
        </label>
    </p>
    <p>
        <label>
            <input class="w3-input" type="text" required placeholder="" name="email"/>
        </label>
    </p>
    <p>
        <label>
            <input class="w3-input" type="password" required placeholder="" name="password"/>
        </label>
    </p>
        <div>
            <input class="w3-button w3-green" type="submit" value="<fmt:message key="registration"/>">
            <c:if test="${requestScope.wrongData}">
            <div class="w3-container">

            </div>
            </c:if>
    </form>
</div>

</body>
</html>
