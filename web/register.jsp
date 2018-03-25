<%--
  Created by IntelliJ IDEA.
  User: ccc
  Date: 2018/3/25
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
    <form action="register.action" method="post">
        用户名：<input type="text" name="username"/><br/>
        密码:<input type="password" name="password"/><br/>
        生日：<input type="text" name="birthday"/><br/>
        爱好：<input type="checkbox" name="hobby" value="吃饭"/>吃饭
        <input type="checkbox" name="hobby" value="睡觉"/>睡觉
        <input type="checkbox" name="hobby" value="写代码"/>写代码
        <br/>
        已婚：<input type="checkbox" value="true" name="married" /><br/>
        <input type="submit" value="注册"/>
    </form>
</body>
</html>
