<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity4">
<head>
    <title>主页</title>
    <link rel="stylesheet" th:href="@{css/bootstrap.min.css}"/>
    <style type="text/css">
        body { padding: 40px; }
    </style>
</head>
<body>
    <h1>使用Spring Security</h1>
    <p>点击 <a href="/hello">这里</a>打招呼</p>

</body>
</html>