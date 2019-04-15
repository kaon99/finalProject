<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <form  method="post"  action="${pageContext.request.contextPath} /university/admin/setgrade/button">

        <p>
            <label>
                <input class="w3-input" type="text" required placeholder="<fmt:message key="text.setmarks.email"/>"
                       name="email"/>
            </label>
        </p>
        <p>
            <label>
                <select class="w3-input"  name="subject">
                    <option disabled><fmt:message key="text.setmarks.subject"/></option>
                    <c:forEach items="${databaseList}" var="subject">
                        <option value="${subject.getId()}">
                                ${subject.getName()}
                        </option>
                    </c:forEach>

                </select>
            </label>
        </p>
        <p>
            <label>
                <input class="w3-input" type="number" required placeholder="<fmt:message key="text.setmarks.assessment"/>"
                       name="grade"/>
            </label>
        </p>
        <input class="w3-button w3-green" type="submit" value="<fmt:message key="text.set.marks"/>">
    </form>


</div>


<form method="post"
      action="${pageContext.request.contextPath}/university/logout">
    <input type="hidden">
    <button type="submit"><fmt:message key="text.logout"/></button>
</form>
</body>
</html>
