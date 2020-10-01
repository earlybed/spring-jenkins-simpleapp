<%--
  Created by IntelliJ IDEA.
  User: ZYH
  Date: 2020/9/30
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<a href="/user/toAdd">添加用户</a><br/>
<a href="/user/toDelete">删除用户</a><br/>
<a href="/user/toUpdate">更新用户</a><br/>
<table border="1">
    <tr>
        <td>id</td>
        <td>username</td>
        <td>name</td>
        <td>password</td>
        <td>type</td>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.name}</td>
            <td>${user.password}</td>
            <td>${user.type}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
