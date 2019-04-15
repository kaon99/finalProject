<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>StudentRating</title>
</head>
<body>
<h1>Student Rating</h1>
<form method="post"
      action="${pageContext.request.contextPath}/university/logout">
    <input type="hidden">
    <button type="submit"><fmt:message key="text.logout"/></button>
</form>


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

<c:forEach items="${studentsReceivedList}" var="student">
    ${student.getNameUa()}
    ${student.getSurnameUa()}
    ${student.getNameEn()}
    ${student.getSurnameEn()}
    ${student.getSumOfaccessment()}
    <br>
</c:forEach>

</body>
</html>
