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
    <title>删除用户</title>
</head>
<body>
<form action="/user/add" method="post">
    name:<input type="text" name="name"><br/>
    username:<input type="text" name="username"><br/>
    password:<input type="password" name="password"><br/>
    <input type="submit" value="提交" ><br/>
</form>

</body>
</html>
