<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/23
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/userController/register" method="post">
        id：<input type="text" name="user_id" ></br>
        电话：<input type="text" name="user_telephone" ></br>
        密码：<input type="text" name="user_password" ></br>
        <input type="submit" value="注册">
    </form>
</body>
</html>
