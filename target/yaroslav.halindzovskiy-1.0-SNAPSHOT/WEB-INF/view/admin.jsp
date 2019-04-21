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
  Time: 1:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title><fmt:message key="text.title"/></title>
</head>
<body>
<jsp:include page="/WEB-INF/parts/header.jsp"/>
<h1 class="flow-text"><fmt:message key="text.admin.page"/></h1>
<div class="center-pill">

<form role="form" method="post"
      action="${pageContext.request.contextPath}/university/admin/setgrade">
    <button  class="btn" type="submit"><fmt:message key="text.set.marks"/></button>
</form>


<form role="form" method="post"
      action="${pageContext.request.contextPath}/university/admin/sendnotification">
    <button class="btn" type="submit"><fmt:message key="text.notification"/></button>
</form>
</div>
</body>
<jsp:include page="/WEB-INF/parts/footer.jsp"/>
</html>
