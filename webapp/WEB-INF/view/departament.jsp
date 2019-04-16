<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fmt:setBundle basename="text"/>
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
    <title><fmt:message key="text.departament"/> </title>
</head>
<body>
<jsp:include page="/WEB-INF/parts/header.jsp"/>
<h1><fmt:message key="text.departament"/></h1>




<form method="post" action="${pageContext.request.contextPath}/university/studentpage/departament/set"  >
    <p>
        <label>
            <select class="w3-input"  name="specialty">
                <option disabled><fmt:message key="text.set.specialty"/></option>
                <c:forEach items="${speciatlyList}" var="specialty">
                    <option value="${specialty.getId()}">
                            ${specialty.getTitle()}
                    </option>
                </c:forEach>

            </select>
        </label>
        <input class="w3-button w3-green" type="submit" value="<fmt:message key="text.set.marks"/>">
</form>
<jsp:include page="/WEB-INF/parts/footer.jsp"/>
</body>
</html>
