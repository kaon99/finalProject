<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="language" value="${not empty sessionScope.language ? sessionScope.language : pageContext.request.locale}"
       scope="session"/>
<fmt:setLocale value="${language}"/>
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
    <title><fmt:message key="text.registration"/> </title>
</head>
<body>
<jsp:include page="/WEB-INF/parts/header.jsp"/>


<form class="w3-container" action="${pageContext.request.contextPath}/university/registration/create" align="center"  method="post">
    <p>
        <label>
            <input class="w3-input" type="text" pattern="^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$" required placeholder= "<fmt:message key="text.name.ua"/>" name="nameUa"/>
        </label>
    </p>
    <p>
        <label>
            <input class="w3-input" type="text" pattern="^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$" required placeholder="<fmt:message key="text.surname.ua"/>" name="surnameUa"/>
        </label>
    </p>
    <p>
        <label>
            <input class="w3-input" type="text" pattern="^[A-Z][a-z]{1,20}$" required placeholder="<fmt:message key="text.name.en"/>" name="nameEn"/>
        </label>
    </p>
    <p>
        <label>
            <input class="w3-input" type="text"pattern="^[A-Z][a-z]{1,20}$" required placeholder="<fmt:message key="text.surname.en"/>" name="surnameEn"/>
        </label>
    </p>
    <p>
        <label>
            <input class="w3-input" type="email" required placeholder="<fmt:message key="text.email"/>" name="email"/>
        </label>
    </p>
    <p>
        <label>
            <input class="w3-input" type="password" required placeholder="<fmt:message key="text.password"/>" name="password"/>
        </label>
    </p>
    <div>
        <input class="w3-button w3-green" type="submit" value="<fmt:message key="text.registration"/>">
        <c:if test="${requestScope.registrationError}">
        <div class="w3-container">
            <fmt:message key="text.rerisration.error"/>
        </div>
        </c:if>
        <c:if test="${requestScope.userExist}">
        <div class="w3-container">
            <fmt:message key="text.user.exist"/>
        </div>
        </c:if>

</form>
</div>
<jsp:include page="/WEB-INF/parts/footer.jsp"/>
</body>
</html>


