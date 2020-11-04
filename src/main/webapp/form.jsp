<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2020-10-24
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>美食商城</title>
    <meta charset="utf-8">

    <link rel="stylesheet" href="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script src="resources/bootstrap-3.3.7-dist/js/jquery-1.9.1.min.js"></script>
    <script src="resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

</head>

<body>
<%--浮动模态框--%>
<%--1--%>
<div class="modal fade" id="one" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="oneLabel">川&nbsp;菜&nbsp;介&nbsp;绍</h4>
            </div>
            <div class="modal-body">
                川菜三派的划分，是在已有定论的上河帮、小河帮、下河帮的基础上，规范化完整表述
                为：上河帮川菜即以川西成都、乐山为中心地区的蓉派川菜；小河帮川菜即以川南自贡
                为中心的盐帮菜,同时包括宜宾菜、泸州菜和内江菜 ；下河帮川菜即以重庆江湖菜、万
                州大碗菜为代表的重庆菜。三者共同组成川菜三大主流地方风味流派分支菜系，代表川
                菜发展最高艺术水平。2017年9月28日，中国烹饪协会授予四川眉山市“川厨之乡”的称
                号，眉山菜成为川菜的代表。取材广泛，调味多变，菜式多样，口味清鲜，醇浓并重，
                以善用麻辣调味著称，并以别具一格的烹调方法和浓郁的地方风味闻名，融会了东南西
                北各方的特点，博采众家之长，善于吸 收和创新。四川省会成都市被联合国教科文组织
                授予“世界美食之都”的荣誉称号。明末清初，辣椒传入，直至清末，风味特点逐渐定型，
                并在新中国成立后得到创新发展，川菜以家常菜为主，高端菜为辅，取材多为日常百味，
                也不乏山珍海鲜。其特点为：“善用三椒”、“一菜一格，百菜百味”；口味多变，包含鱼
                香、家常、麻辣、红油、蒜泥、姜汁、陈 皮、芥末、纯甜、怪味等24种口味。代表菜品
                有鱼香肉丝、宫保鸡丁、水煮肉片、夫妻肺片、麻婆豆腐、回锅肉、泡椒凤爪、灯影牛肉
                口水鸡、香辣虾、尖椒炒牛肉、重庆火锅、板栗烧 鸡、辣子鸡等。
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关 闭</button>
            </div>
        </div>
    </div>
</div>
<%--2--%>
<div class="modal fade" id="two" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="twoLabel">鲁&nbsp;菜&nbsp;介&nbsp;绍</h4>
            </div>
            <div class="modal-body">
                鲁菜，是起源于山东省烟台市福山区的齐鲁风味菜系（现通行地带不仅限于当代的山东省
                以大连菜为代表的辽南菜系也属于鲁菜），是中国传统四大菜系（也是八大菜系）中唯一
                的自发型菜系（相对于淮扬、川、粤等影响型菜系而言），黄河流域烹饪文化的代表，是
                历史最悠久、技法最丰富、难度最高、最见功力的菜系之一。2500年前山东的儒家学派奠
                定了中国饮食注重精细、中和、健康的审美取向；北魏末年《齐民要术》（成书时间为约
                公元533—544年）总结的黄河中下游地区的“蒸、煮、烤、酿、煎、炒、熬、烹、炸、腊、
                盐、豉、醋、酱、酒、蜜、椒”奠定了中式烹调技法的框架；明清时期大量山东厨师和菜品
                进入宫廷，使鲁菜雍容华贵、中正大气、平和养生的风格特点进一步得到升华。经典菜品
                有一品豆腐、葱烧海参、三丝鱼翅、白扒四宝、糖醋黄河鲤鱼、九转大肠、油爆双脆、扒原
                壳鲍鱼、油焖大虾、醋椒鱼、糟熘鱼片、温炝鳜鱼片、芫爆鱿鱼卷、清汤银耳、木樨肉（木
                须肉）、胶东四大温拌、糖醋里脊、红烧大虾、招远蒸丸、枣庄辣子鸡、清蒸加吉鱼、济南
                把子肉,葱椒鱼、糖酱鸡块、油泼豆莛、诗礼银杏、奶汤蒲菜、乌鱼蛋汤、锅烧鸭、香酥鸡
                黄鱼豆腐羹、拔丝山药、蜜汁梨球、砂锅散丹、布袋鸡、芙蓉鸡片、氽芙蓉黄管、阳关三叠
                雨前虾仁、乌云托月、黄焖鸡块、锅塌黄鱼、奶汤鲫鱼、烧二冬、泰山三美汤、清汤西施舌
                赛螃蟹、烩两鸡丝、象眼鸽蛋、云片猴头菇、油爆鱼芹、酥炸全蝎、西瓜鸡等。
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关 闭</button>
            </div>
        </div>
    </div>
</div>
<%--3--%>
<div class="modal fade" id="three" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="threeLabel">粤&nbsp;菜&nbsp;介&nbsp;绍</h4>
            </div>
            <div class="modal-body">
                粤菜即广东菜，是中国汉族四大菜系、八大菜系之一。狭义上的粤菜指广府菜（即广州府菜）
                广义上又包含潮州菜（潮汕菜）、东江菜（也称客家菜）。粤菜源自中原，传承了孔子所倡导
                的“食不厌精，脍不厌细”的中原饮食风格，因此粤菜做法比较复杂，精细，如广府菜中的煲仔
                饭、烤乳猪就是源自周代的“八珍”美食。广府菜范围包括珠江三角洲和韶关、湛江等地，具有
                清、鲜、爽、嫩、滑等特色，“五滋”、“六味”俱佳，擅长小炒，要求掌握火候和油温恰到好处
                还兼容许多西菜做法，讲究菜的气势、档次。广府菜是粤菜的代表，自古有“食在广州，厨出凤
                城(顺德)”、“食在广州，味在西关”的美誉，顺德更被联合国教科文组织授予世界“美食之都”称
                号。潮州菜发源于广东潮汕地区，潮菜是粤菜的主干与粤菜的代表，也有“食在广 州、味在潮
                州”的说法。在2004年荣获第五届全国烹饪技术比赛团体金奖，2010年代表粤菜参加上海世博
                会，2012年代表中国菜参加韩国丽水世博会。潮州市2014年入选中国国际广播电台“全球网民
                推荐的最中国美食城市”。广东客家菜主要流行在梅州、惠州、河源、韶关、深圳等地，范围包
                括梅江、东江和北江流域。客家菜可细分为“山系”、“水系”、“散客菜”。山系的“客家菜”，分
                布在梅州等地，而水系指的就是“东江菜”。梅州是客家菜之乡，而客家菜以东江菜为代表，菜
                品多用肉类，极少水产，主料突出，讲究香浓，下油重，味偏咸，以砂锅菜见长，乡土气息浓郁。
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关 闭</button>
            </div>
        </div>
    </div>
</div>
<%--4--%>
<div class="modal fade" id="four" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="fourLabel">苏&nbsp;菜&nbsp;介&nbsp;绍</h4>
            </div>
            <div class="modal-body">
                江苏菜，中国传统八大菜系之一，简称苏菜。由于苏菜和浙菜相近，因此和浙菜统称江浙菜系。主要以金陵菜、淮扬菜、苏锡菜、徐海菜等地方菜组成。江苏菜起源于二千多年前，其中金陵菜起源于先秦时期，当时吴人善制炙鱼、蒸鱼和鱼片，一千多年前，鸭已为南京美食。南宋时，苏菜和浙菜同为“南食”的两大台柱。
                苏菜擅长炖、焖、蒸、炒，重视调汤，保持菜的原汁，风味清鲜，浓而不腻，淡而不薄，酥松脱骨而不失其形，滑嫩爽脆而不失其味。
                金陵菜口味和醇，玲珑细巧；徐州菜色调浓重，习尚五辛；扬州菜清淡适口，刀工精细；苏州菜口味趋甜，清雅多姿。其名菜有金陵烤鸭、彭城鱼丸、老鸭汤、炖生敲、烤方、羊方藏鱼、水晶肴蹄、清炖蟹粉狮子头、霸王别姬、黄泥煨鸡、清炖鸡孚、盐水鸭、金陵板鸭、鼋汁狗肉、金香饼、鸡汤煮干丝、肉酿生麸、红烧沙光鱼、凤尾虾、三套鸭、无锡肉骨头、陆稿荐酱猪头肉等。
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关 闭</button>
            </div>
        </div>
    </div>
</div>
<%--5--%>
<div class="modal fade" id="five" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="fiveLabel">浙&nbsp;菜&nbsp;介&nbsp;绍</h4>
            </div>
            <div class="modal-body">
                浙江菜，简称浙菜，是中国传统八大菜系之一，其地山清水秀，物产丰富，故谚曰：“上有天堂，下有苏杭”。浙江省位于我国东海之滨，北部水道成网，素有鱼米之乡之称。西南丘陵起伏，盛产山珍野味。东部沿海渔场密布，水产资源丰富，有经济鱼类和贝壳水产品500余种，总产值居全国之首，物产丰富，佳肴自美，特色独具，有口皆碑
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关 闭</button>
            </div>
        </div>
    </div>
</div>
<%--6--%>
<div class="modal fade" id="six" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="sixLabel">闽&nbsp;菜&nbsp;介&nbsp;绍</h4>
            </div>
            <div class="modal-body">
                闽菜是中国八大菜系之一，历经中原汉族文化和闽越族文化的混合而形成。闽菜发源于福州，以福州菜为基础，后又融合闽东、闽南、闽西、闽北、莆仙五地风味菜形成的菜系。狭义闽菜指以福州菜，最早起源于福建福州闽县，后来发展成福州、闽南、闽西三种流派,即广义闽菜。
                由于福建人民经常往来于海上，于是饮食习俗也逐渐形成带有开放特色的一种独特的菜系。闽菜以烹制山珍海味而著称，在色香味形俱佳的基础上，尤以“香”、“味”见长，其清鲜、和醇、荤香、不腻的风格特色，以及汤路广泛的特点，在烹坛园地中独具一席。福州菜淡爽清鲜，讲究汤提鲜，擅长各类山珍海味；闽南菜（厦门、漳州、泉州一带）讲究佐料调味，重鲜香；闽西菜（长汀、宁化一带）偏重咸辣，烹制多为山珍，特显山区风味。故此，闽菜形成三大特色，一长于红糟调味，二长于制汤，三长于使用糖醋。
                闽菜除招牌菜“佛跳墙”外，还有鸡汤氽海蚌、八宝红鲟饭、白炒鲜竹蛏、太极芋泥、淡糟香螺片、爆炒双脆、南煎肝、荔枝肉、醉排骨、荷包鱼翅、龙身凤尾虾、翡翠珍珠鲍、鸡茸金丝笋、肉米鱼唇、鼎边糊、福州鱼丸、肉燕、漳州卤面、莆田卤面、海蛎煎、沙县拌面、扁食、厦门沙茶面、面线糊、闽南咸饭、兴化米粉、红糟鱼、五柳居、白雪鸡、长汀豆腐干，等菜品和小吃，均别有风味。
                汤是闽菜之精髓，素有一汤十变之说。据昙石山文化遗址考证，闽人在5000多年前就有了吃海鲜和制作汤食的传统。福建一年四季如春，这样的气候适合做汤。
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关 闭</button>
            </div>
        </div>
    </div>
</div>
<%--7--%>
<div class="modal fade" id="seven" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="sevenLabel">湘&nbsp;菜&nbsp;介&nbsp;绍</h4>
            </div>
            <div class="modal-body">
                湘菜，又叫湖南菜，是中国历史悠久的汉族八大菜系之一，早在汉朝就已经形成菜系。以湘江流域、洞庭湖区和湘西山区三种地方风味为主。
                湘菜制作精细，用料上比较广泛，口味多变，品种繁多；色泽上油重色浓，讲求实惠；品味上注重香辣、香鲜、软嫩；制法上以煨、炖、腊、蒸、炒诸法见称。
                官府湘菜代表菜品以组庵湘菜为代表，如组庵豆腐、组庵鱼翅等；民间湘菜代表菜品有剁椒鱼头、辣椒炒肉、湘西外婆菜、吉首酸肉、牛肉粉，衡阳鱼粉，栖凤渡鱼粉，东安鸡，金鱼戏莲、永州血鸭、九嶷山兔、宁远酿豆腐、腊味合蒸、姊妹团子 、宁乡口味蛇、岳阳姜辣蛇等。。
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关 闭</button>
            </div>
        </div>
    </div>
</div>
<%--8--%>
<div class="modal fade" id="eight" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="eightLabel">徽&nbsp;菜&nbsp;介&nbsp;绍</h4>
            </div>
            <div class="modal-body">
                徽菜，指徽州菜，是中国传统的八大菜系之一，是独具一格，自成一体的著名菜系。徽菜起源于秦汉，兴于唐宋，盛于明清，在清朝中、末期达到了鼎盛，徽菜是徽州六县的地方特色，其独特的地理人文环境赋予徽菜独有的味道，由于明清徽商的崛起，这种地方风味逐渐进入市肆，流传于苏、浙、赣、闽、沪、鄂至长江中下游区域，具有广泛的影响，明清时期一度居于八大菜系之首。代表菜品：徽州毛豆腐、红烧臭鳜鱼、火腿炖甲鱼、腌鲜鳜鱼、黄山炖鸽等等。
                徽菜起源于南宋时期的古徽州(今安徽歙县一带)，原是徽州山区的地方风味。由于徽商的崛起，这种地方风味逐渐进入市肆，流传于苏、浙、赣、闽、沪、鄂以至长江中、下游区域，具有广泛的影响。
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关 闭</button>
            </div>
        </div>
    </div>
</div>




<%--模态框body子元素--%>
<div class="modal fade" id="mymodel" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="exampleModalLabel">修改美食信息</h4>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="recipient-name" class="control-label">美食ID</label>
                        <input type="text" class="form-control" readonly="readonly" id="recipient-name">
                    </div>
                    <div class="form-group">
                        <label for="recipient-name" class="control-label">美食名称</label>
                        <input type="text" class="form-control" readonly="readonly" id="name">
                    </div>
                    <div class="form-group">
                        <label for="recipient-name" class="control-label">美食类别</label>
                        <input type="text" class="form-control" id="type">
                    </div>
                    <div class="form-group">
                        <label for="recipient-name" class="control-label">美食价格</label>
                        <input type="text" class="form-control" id="price">
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" id="btn2">确定</button>
            </div>
        </div>
    </div>
</div>

<%--添加信息模态框,采用表单提交，区别于ajax--%>
<div class="modal fade" id="my" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" >添加美食信息</h4>
            </div>
            <div class="modal-body">
                <form action="/addFoodInfo" method="post">

                    <div class="form-group">
                        <label for="recipient-name" class="control-label">美食名称</label>
                        <input type="text" name="name" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="recipient-name" class="control-label">美食类别</label>
                        <input type="text" class="form-control" name="type">
                    </div>
                    <div class="form-group">
                        <label for="recipient-name" class="control-label">美食价格</label>
                        <input type="text" class="form-control" name="price">
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                        <button type="submit" class="btn btn-primary">确定</button>
                    </div>
                </form>
            </div>


        </div>
    </div>
</div>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">

        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>

        </div>


        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li ><a href="findAllFoods">菜 品 查 询</a></li>
                <li><a href="addFoodInfo" data-toggle="modal" data-target="#my">菜 品 添 加</a></li>
                <li><button style="background-color: black"  type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#one"><a style="color: white" href="#">川 菜</a></button></li>
                <li><button style="background-color: black"  type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#two"><a style="color: white" href="#">鲁 菜</a></button></li>
                <li><button style="background-color: black"  type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#three"><a style="color: white" href="#">粤 菜</a></button></li>
                <li><button style="background-color: black"  type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#four"><a style="color: white" href="#">苏 菜</a></button></li>
                <li><button style="background-color: black"  type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#five"><a style="color: white" href="#">浙 菜</a></button></li>
                <li><button style="background-color: black"  type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#six"><a style="color: white" href="#">闽 菜</a></button></li>
                <li><button style="background-color: black"  type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#seven"><a style="color: white" href="#">湘 菜</a></button></li>
                <li><button style="background-color: black"  type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#eight"><a style="color: white" href="#">徽 菜</a></button></li>
                <li><a href="#" style="color: #5bc0de">欢迎&nbsp;${name}&nbsp;登录美食商城</a></li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>
                <li><a href="/logout" style="color: #5bc0de">退出</a></li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>
                </li>
            </ul>
            <form class="navbar-form navbar-left" action="/selectFoodNameForLike" method="post">
                <div class="form-group">
                    <input type="text" name="name" class="form-control" placeholder="检索菜名...">
                </div>
                <button type="submit" class="btn btn-default">查询</button>
            </form>
        </div>
    </div>
</nav>
<table class="table table-striped table-bordered table-hover table-condensed">
    <h2 style="text-align: center">美 食 信 息 一 览 表</h2>
    <tr class="success">
        <td>编号</td>
        <td>美食名</td>
        <td>类型</td>
        <td>价格</td>
        <td>备注</td>
    </tr>

<%--    <tr><td colspan="6" align="center"><a href="findAllFoods?currentPage1=${currentPage-1}">上页</a>--%>
<%--        |<a href="findAllFoods?currentPage1=${currentPage+1}">下页</a>--%>
<%--    </td>--%>
<%--    </tr>--%>

<%--    <tr><td colspan="6" align="center">--%>
<%--        |<a href="findAllFoods">一共${page}页</a>--%>
<%--    </td>--%>
<%--    </tr>--%>
<%--    list获取绑定的集合,i代表的是变量--%>
    <c:forEach items="${list}" var="i">
    <tr>
        <td>${i.id}</td>
        <td>${i.name}</td>
        <td>${i.type}</td>
        <td>${i.price}</td>
        <td><a href="/deleteFoodById?id=${i.id}">删除</a>|<a  onclick="findFoodById('${i.id}')" data-toggle="modal" data-target="#mymodel">修改</a></td>

    </tr>
    </c:forEach>


</table>

</body>
<script>
    function findFoodById(id) {

        $.get("/findFoodForUpdateFoodById", "id=" + id, function (data) {
            //返回json数据
            $("#recipient-name").val(data.id);
            $("#name").val(data.name);
            $("#type").val(data.type);
            $("#price").val(data.price);
        });

        //给确定按钮添加点击事件
        $("#btn2").click(function () {
            //获取数据
            var id = $("#recipient-name").val();
            var name = $("#name").val();
            var type = $("#type").val();
            var price = $("#price").val();


            location.href = "/toUpdateFoodInfo?id=" + id + "&name=" + name + "&type=" + type + "&price=" + price;
        });

    }
</script>
</html>
