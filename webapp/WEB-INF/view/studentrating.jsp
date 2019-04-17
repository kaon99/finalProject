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
  Time: 1:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><fmt:message key="text.student.rating"/> </title>
</head>
<body>
<jsp:include page="/WEB-INF/parts/header.jsp"/>
<h1><fmt:message key="text.student.rating" /></h1>


<form method="post" action="${pageContext.request.contextPath}/university/studentpage/studentrating/show">
    <p>
        <label>
            <select class="w3-input" name="specialty">
                <option selected disabled hidden style='display: none' value=''></option>
                <option disabled hidden><fmt:message key="text.set.specialty"/></option>

                <c:forEach items="${speciatlyList}" var="specialty">
                    <option value="${specialty.getId()}">
                            ${specialty.getTitle()}
                    </option>
                </c:forEach>

            </select>
        </label>
    </p>
    <input class="w3-button w3-green" type="submit" value="<fmt:message key="text.set.specialty"/>">
</form>


<table class="highlight">

    <tbody>
<c:forEach items="${studentsReceivedList}" var="student">
    <tr>
        <td> ${student.getNameUa()} </td>
        <td> ${student.getSurnameUa()} </td>
        <td> ${student.getNameEn()} </td>
        <td> ${student.getSurnameEn()} </td>
        <td> ${student.getSumOfaccessment()} </td>
    </tr>

</c:forEach>
    </table>
<jsp:include page="/WEB-INF/parts/footer.jsp"/>
</body>
</html>
