<%--
  Created by IntelliJ IDEA.
  User: kt20180311
  Date: 2020/7/27
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<h1>index</h1>
<form action="demo03/request" method="post">
    <input name="name" type="text"/>
    <input name="age" type="text"/>
    <input type="submit" value="提交">
</form>
<form action="demo03/request02" method="post">
    <input name="name" type="text"/>
    <input name="age" type="text"/>
    <input type="submit" value="提交">
</form>
<hr>
<form action="${pageContext.request.contextPath}/demo03/request03" method="post">
    <input type="text" name="userList[0].name"/>
    <input type="text" name="userList[0].age"/>
    <input type="text" name="userList[1].name"/>
    <input type="text" name="userList[1].age"/>
    <input type="submit" value="提交">
</form>
</body>
</html>
