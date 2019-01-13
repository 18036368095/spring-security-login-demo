<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta content="text/html;charset=UTF-8"/>
    <title>登录</title>
    <style type="text/css">
        body { padding: 20px; }
    </style>
</head>
<body>
<form action="/user/login" method="post">
    name: <input type="text" name="userName"><br/>
    pass: <input type="password" name="pwd"><br/>
    <input type="submit" value="登录">
</form>

</form>
</body>
</html>