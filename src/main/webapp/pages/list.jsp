<%@ page import="java.util.List" %>
<%@ page import="com.entity.User" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: kt20180311
  Date: 2020/7/29
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>list</title>

<!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
<!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
<!--[if lt IE 9]>
<script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
<![endif]-->
</head>
<body>
<%
    List<User> userList = new ArrayList<User>();
    User user = new User();
    user.setName("zhangsan");
    user.setPassWord("ndk33jf");
    User user1 = new User();
    user1.setName("lisi");
    user1.setPassWord("ndfsfkjf");
    User user2 = new User();
    user2.setName("wangwu");
    user2.setPassWord("ndkjfdsff");
    userList.add(user);
    userList.add(user2);
    userList.add(user1);
    session.setAttribute("userList",userList);
%>
<table class="table">
    <tr>
        <td>number</td>
        <td>username</td>
        <td>password</td>
    </tr>
    <c:forEach varStatus="s" items="${userList}" var="user">
        <tr>
            <td>${s.count}</td>
            <td>${user.name}</td>
            <td>${user.passWord}</td>
        </tr>
    </c:forEach>
</table>

<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="../js/bootstrap.min.js"></script>
</body>
</html>
