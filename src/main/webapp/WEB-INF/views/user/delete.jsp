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
    <title>添加用户</title>
</head>
<body>
<h1>请输入删除用户ID</h1>
<form action="/user/delete" method="post">
    id:<input type="text" name="id"><br/>
    <input type="submit" value="提交" ><br/>
</form>

</body>
</html>
