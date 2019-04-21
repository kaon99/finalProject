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
  Time: 1:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="${language}">
<head>
    <jsp:include page="/WEB-INF/parts/header.jsp"/>
    <title><fmt:message key="text.title"/></title></head>
<body>
<h1 class="flow-text"><fmt:message key="text.student.page"/></h1>


<form method="post"
      action="${pageContext.request.contextPath}/university/studentpage/departament">
    <input type="hidden">
    <button class="btn" type="submit"><fmt:message key="text.departament"/></button>
</form>

<form method="post"
      action="${pageContext.request.contextPath}/university/studentpage/studentrating">
    <input type="hidden">
    <button class="btn" type="submit"><fmt:message key="text.student.rating"/></button>
</form>
<div class="row">
    <div class="col s12 m6">
        <div class="card blue-grey darken-1">
            <div class="card-content white-text">
                <div>
                    <c:choose>
                        <c:when test="${language == 'ua'}">
                            <fmt:message key="text.name.ua"/>
                            <c:out value="${nameUa}"/>
                            <br>
                            <fmt:message key="text.surname.ua"/>
                            <c:out value="${surnameUa}"/>
                        </c:when>
                        <c:otherwise>
                            <fmt:message key="text.name.en"/>
                            <c:out value="${nameEn}"/>
                            <br>
                            <fmt:message key="text.surname.ua"/>
                            <c:out value="${surnameEn}"/>
                        </c:otherwise>
                    </c:choose>
                    <br>
                    <fmt:message key="text.email"/>
                    <c:out value="${email}"/>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/WEB-INF/parts/footer.jsp"/>
</body>
</html>
