<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2020-10-24
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>美食商城</title>
    <script src="resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script src="resources/bootstrap-3.3.7-dist/js/jquery-1.9.1.min.js"></script>
    <link rel="stylesheet" href="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css">
</head>
<body>
<div class="navbar navbar-default navbar-fixed-top navbar-inverse">
    <div class="container-fluid">

        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">八大菜系</a>
        </div>


        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active">
                    <a href="">川 菜</a></li>
                <li><a href="">鲁 菜</a></li>
                <li><a href="">粤 菜</a></li>
                <li><a href="">苏 菜</a></li>
                <li><a href="">浙 菜</a></li>
                <li><a href="">闽 菜</a></li>
                <li><a href="">湘 菜</a></li>
                <li><a href="">徽 菜</a></li>
                </li>
            </ul>
            <p class="navbar-text navbar-collapse">美 食 商 城 欢 迎 小 主</p>

            <form class="navbar-form navbar-right">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="小主想知道啥">
                </div>
                <button type="submit" class="btn btn-default">点我</button>
            </form>
            <br/>
            <br/>
            <br/>


        </div>

    </div>


    <hr>
    <hr>
    <form action="/foodInfo" method="post">

    </form>
</div>


</body>
</html>
