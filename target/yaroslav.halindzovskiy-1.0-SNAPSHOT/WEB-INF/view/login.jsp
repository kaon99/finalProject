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
    <title>Это страница логина</title>
</head>
<body>
<h1> Работает</h1>






    <div>
        <h2>Enter login and password:</h2>
        <form action="${pageContext.request.contextPath}/university/login" method="post">
            Login: <input type="text" name="login" required="required"/>
            Password: <input type="text" name="password" required="required"/>
            <input type="submit" value="Log in"/>
        </form>
    </div>


</body>
</html>
