<%--
  Created by IntelliJ IDEA.
  User: kt20180311
  Date: 2020/7/29
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>upload</title>
</head>
<body>
<form action="file/upload" method="post" enctype="multipart/form-data">
    <input name="name" type="text/"><br>
    <input name="uploadFile" type="file"/><br>
    <input type="submit"/>
</form>
</body>
</html>
