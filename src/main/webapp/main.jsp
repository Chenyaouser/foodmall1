<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2020-10-23
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>美食商城</title>
    <script src="resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script src="resources/bootstrap-3.3.7-dist/js/jquery-1.9.1.min.js"></script>
    <link rel="stylesheet" href="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <style type="text/css">
        /* 通用选择器，选中网页所有元素 */
        *{
            margin: 0;/* 外边距 */
            padding: 0;/* 内边距 */
        }
        .menu{
            background-image: url("/resources/image/ba.jpg");


        }
        .c1{
            border: 0.5px solid transparent;
            float: left;
            width: 24%;
            height: 300px;
            text-align: center;
            margin-left: 10px;

        }

        .b1{
            cursor: pointer;
            margin-right: 10px;
        }

        .b2{
            cursor: pointer;
            margin-left: 10px;
        }


        .c2{

            height: 100px;
            width: 50%;
            margin-left: 700px;
            text-align: center;
            float: right;
            margin: 0;
            margin-top: 100px;
        }

        #a2{
            width: 40%;
            height: 250px;
            margin-left: 100px;
            margin-top: 40px;

        }



    </style>
</head>
<body>

<div class="navbar navbar-default navbar-fixed-top">
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
                    <a href="https://baike.baidu.com/item/%E5%B7%9D%E8%8F%9C/26409?fr=aladdin">川 菜</a></li>
                <li><a href="https://baike.baidu.com/item/%E9%B2%81%E8%8F%9C/458122?fr=aladdin">鲁 菜</a></li>
                <li><a href="https://baike.baidu.com/item/%E7%B2%A4%E8%8F%9C/306654?fr=aladdin">粤 菜</a></li>
                <li><a href="https://baike.baidu.com/item/%E6%B1%9F%E8%8B%8F%E8%8F%9C/757561?fromtitle=%E8%8B%8F%E8%8F%9C&fromid=1138373&fr=aladdin">苏 菜</a></li>
                <li><a href="https://baike.baidu.com/item/%E6%B5%99%E6%B1%9F%E8%8F%9C/762656?fromtitle=%E6%B5%99%E8%8F%9C&fromid=1246638&fr=aladdin">浙 菜</a></li>
                <li><a href="https://baike.baidu.com/item/%E9%97%BD%E8%8F%9C">闽 菜</a></li>
                <li><a href="https://baike.baidu.com/item/%E6%B9%98%E8%8F%9C/873783?fr=aladdin">湘 菜</a></li>
                <li><a href="https://baike.baidu.com/item/%E5%BE%BD%E8%8F%9C">徽 菜</a></li>
                </li>
            </ul>
            <p class="navbar-text navbar-collapse">美 食 商 城 欢 迎 小 主</p>

            <form class="navbar-form navbar-right">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="小主想知道啥">
                </div>
                <button type="submit" class="btn btn-default">点我</button>
            </form>

        </div>
    </div>
</div>

<div class="menu">
    <form action="/foodInfo" method="post">
    <div>

        <div class="c1">
            <img src="/resources/image1/01_1.png" height="175px" width="80%"/>
            <p>水煮肉片</p>
            <p>川菜</p>
            <p>价格:25元</p>
            <button class="b1">选择</button>

        </div>

        <div class="c1">
            <img src="/resources/image1/01_2.png" height="175px" width="80%"/>
            <p>宫保鸡</p>
            <p>川菜</p>
            <p>价格:22元</p>
            <button class="b1">选择</button>

        </div>

        <div class="c1">
            <img src="/resources/image1/02_1.png" height="175px" width="80%"/>
            <p>糖醋鲤鱼</p>
            <p>鲁菜</p>
            <p>价格:35元</p>
            <button class="b1">选择</button>

        </div>

        <div class="c1">
            <img src="/resources/image1/02_2.png" height="175px" width="80%"/>
            <p>四喜丸子</p>
            <p>鲁菜</p>
            <p>价格:20元</p>
            <button class="b1">选择</button>

        </div>

        <div class="c1">
            <img src="/resources/image1/03_1.png" height="175px" width="80%"/>
            <p>白斩鸡</p>
            <p>粤菜</p>
            <p>价格:22元</p>
            <button class="b1">选择</button>

        </div>

        <div class="c1">
            <img src="/resources/image1/03_2.png" height="175px" width="80%"/>
            <p>叉烧</p>
            <p>粤菜</p>
            <p>价格:40元</p>
            <button class="b1">选择</button>

        </div>

        <div class="c1">
            <img src="/resources/image1/04_1.png" height="175px" width="80%"/>
            <p>松鼠鳜鱼</p>
            <p>苏菜</p>
            <p>价格:85元</p>
            <button class="b1">选择</button>

        </div>

        <div class="c1">
            <img src="/resources/image1/04_2.png" height="175px" width="80%"/>
            <p>盐水鸭</p>
            <p>苏菜</p>
            <p>价格:35元</p>
            <button class="b1">选择</button>

        </div>

        <div class="c1">
            <img src="/resources/image1/05_1.png" height="175px" width="80%"/>
            <p>东坡肉</p>
            <p>浙菜</p>
            <p>价格:68元</p>
            <button class="b1">选择</button>

        </div>

        <div class="c1">
            <img src="/resources/image1/05_2.png" height="175px" width="80%"/>
            <p>南瓜盅八宝饭</p>
            <p>浙菜</p>
            <p>价格:15元</p>
            <button class="b1">选择</button>

        </div>

        <div class="c1">
            <img src="/resources/image1/06_1.png" height="175px" width="80%"/>
            <p>佛跳墙</p>
            <p>闽菜</p>
            <p>价格:288元</p>
            <button class="b1">选择</button>

        </div>

        <div class="c1">
            <img src="/resources/image1/06_2.png" height="175px" width="80%"/>
            <p>沙县拌面</p>
            <p>闽菜</p>
            <p>价格:12元</p>
            <button class="b1">选择</button>

        </div>

        <div class="c1">
            <img src="/resources/image1/07_1.png" height="175px" width="80%"/>
            <p>剁椒鱼头</p>
            <p>湘菜</p>
            <p>价格:50元</p>
            <button class="b1">选择</button>

        </div>

        <div class="c1">
            <img src="/resources/image1/07_2.png" height="175px" width="80%"/>
            <p>牛肉粉</p>
            <p>湘菜</p>
            <p>价格:16元</p>
            <button class="b1">选择</button>

        </div>

        <div class="c1">
            <img src="/resources/image1/08_1.png" height="175px" width="80%"/>
            <p>火腿炖甲鱼</p>
            <p>徽菜</p>
            <p>价格:125元</p>
            <button class="b1">选择</button>

        </div>

        <div class="c1">
            <img src="/resources/image1/08_2.png" height="175px" width="80%"/>
            <p>黄山炖鸽</p>
            <p>徽菜</p>
            <p>价格:45元</p>
            <button class="b1">选择</button>


        </div>


    </div>
    </form>

    <table class="c2">
        <tr>
            <input type="image" id="a2" src="/resources/image1/9.jpg"/>
        </tr>

        <tr>
            <td>联系客服</td>
            <td>开放平台</td>
            <td>法律声明</td>
        </tr>
        <tr>
            <td>淘宝网</td>
            <td>天猫</td>
            <td>聚划算</td>
        </tr>
        <tr>
            <td>支付宝</td>
            <td>虾米</td>
            <td>钉钉</td>
        </tr>
        <tr>
            <td>廉政举报</td>
            <td>阿里巴巴</td>
            <td>UC</td>
        </tr>

    </table>

</div>
</nav>
</body>
<script>

</script>
</html>
