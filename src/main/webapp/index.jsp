<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    *{
        margin: 0;
        padding: 0;
    }
    div{
        position: relative;
        top: 50%;
        left: 50%;
        margin-left: -200px;
        margin-top: -50px;
    }
    a{
        width: 400px;
        height: 100px;
        background-color: bisque;
        display: inline-block;
        text-align: center;
        line-height: 100px;
        font-size: 30px;
        text-decoration: none;
        border-radius: 10px;
    }
</style>
<body>
    <div>
        <a href="${pageContext.request.contextPath}/book/listBook">进入图书管理系统</a>
    </div>
</body>
</html>

