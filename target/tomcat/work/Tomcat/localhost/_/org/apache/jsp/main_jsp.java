/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-10-26 00:41:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>美食商城</title>\r\n");
      out.write("    <script src=\"resources/bootstrap-3.3.7-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/bootstrap-3.3.7-dist/js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/bootstrap-3.3.7-dist/css/bootstrap.min.css\">\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        /* 通用选择器，选中网页所有元素 */\r\n");
      out.write("        *{\r\n");
      out.write("            margin: 0;/* 外边距 */\r\n");
      out.write("            padding: 0;/* 内边距 */\r\n");
      out.write("        }\r\n");
      out.write("        .menu{\r\n");
      out.write("            background-image: url(\"/resources/image/ba.jpg\");\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        .c1{\r\n");
      out.write("            border: 0.5px solid transparent;\r\n");
      out.write("            float: left;\r\n");
      out.write("            width: 24%;\r\n");
      out.write("            height: 300px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-left: 10px;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .b1{\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .b2{\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            margin-left: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .c2{\r\n");
      out.write("\r\n");
      out.write("            height: 100px;\r\n");
      out.write("            width: 50%;\r\n");
      out.write("            margin-left: 700px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            float: right;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            margin-top: 100px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #a2{\r\n");
      out.write("            width: 40%;\r\n");
      out.write("            height: 250px;\r\n");
      out.write("            margin-left: 100px;\r\n");
      out.write("            margin-top: 40px;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">八大菜系</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                <li class=\"active\">\r\n");
      out.write("                    <a href=\"https://baike.baidu.com/item/%E5%B7%9D%E8%8F%9C/26409?fr=aladdin\">川 菜</a></li>\r\n");
      out.write("                <li><a href=\"https://baike.baidu.com/item/%E9%B2%81%E8%8F%9C/458122?fr=aladdin\">鲁 菜</a></li>\r\n");
      out.write("                <li><a href=\"https://baike.baidu.com/item/%E7%B2%A4%E8%8F%9C/306654?fr=aladdin\">粤 菜</a></li>\r\n");
      out.write("                <li><a href=\"https://baike.baidu.com/item/%E6%B1%9F%E8%8B%8F%E8%8F%9C/757561?fromtitle=%E8%8B%8F%E8%8F%9C&fromid=1138373&fr=aladdin\">苏 菜</a></li>\r\n");
      out.write("                <li><a href=\"https://baike.baidu.com/item/%E6%B5%99%E6%B1%9F%E8%8F%9C/762656?fromtitle=%E6%B5%99%E8%8F%9C&fromid=1246638&fr=aladdin\">浙 菜</a></li>\r\n");
      out.write("                <li><a href=\"https://baike.baidu.com/item/%E9%97%BD%E8%8F%9C\">闽 菜</a></li>\r\n");
      out.write("                <li><a href=\"https://baike.baidu.com/item/%E6%B9%98%E8%8F%9C/873783?fr=aladdin\">湘 菜</a></li>\r\n");
      out.write("                <li><a href=\"https://baike.baidu.com/item/%E5%BE%BD%E8%8F%9C\">徽 菜</a></li>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <p class=\"navbar-text navbar-collapse\">美 食 商 城 欢 迎 小 主</p>\r\n");
      out.write("\r\n");
      out.write("            <form class=\"navbar-form navbar-right\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"小主想知道啥\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-default\">点我</button>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"menu\">\r\n");
      out.write("    <form action=\"/foodInfo\" method=\"post\">\r\n");
      out.write("    <div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"c1\">\r\n");
      out.write("            <img src=\"/resources/image1/01_1.png\" height=\"175px\" width=\"80%\"/>\r\n");
      out.write("            <p>水煮肉片</p>\r\n");
      out.write("            <p>川菜</p>\r\n");
      out.write("            <p>价格:25元</p>\r\n");
      out.write("            <button class=\"b1\">选择</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"c1\">\r\n");
      out.write("            <img src=\"/resources/image1/01_2.png\" height=\"175px\" width=\"80%\"/>\r\n");
      out.write("            <p>宫保鸡</p>\r\n");
      out.write("            <p>川菜</p>\r\n");
      out.write("            <p>价格:22元</p>\r\n");
      out.write("            <button class=\"b1\">选择</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"c1\">\r\n");
      out.write("            <img src=\"/resources/image1/02_1.png\" height=\"175px\" width=\"80%\"/>\r\n");
      out.write("            <p>糖醋鲤鱼</p>\r\n");
      out.write("            <p>鲁菜</p>\r\n");
      out.write("            <p>价格:35元</p>\r\n");
      out.write("            <button class=\"b1\">选择</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"c1\">\r\n");
      out.write("            <img src=\"/resources/image1/02_2.png\" height=\"175px\" width=\"80%\"/>\r\n");
      out.write("            <p>四喜丸子</p>\r\n");
      out.write("            <p>鲁菜</p>\r\n");
      out.write("            <p>价格:20元</p>\r\n");
      out.write("            <button class=\"b1\">选择</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"c1\">\r\n");
      out.write("            <img src=\"/resources/image1/03_1.png\" height=\"175px\" width=\"80%\"/>\r\n");
      out.write("            <p>白斩鸡</p>\r\n");
      out.write("            <p>粤菜</p>\r\n");
      out.write("            <p>价格:22元</p>\r\n");
      out.write("            <button class=\"b1\">选择</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"c1\">\r\n");
      out.write("            <img src=\"/resources/image1/03_2.png\" height=\"175px\" width=\"80%\"/>\r\n");
      out.write("            <p>叉烧</p>\r\n");
      out.write("            <p>粤菜</p>\r\n");
      out.write("            <p>价格:40元</p>\r\n");
      out.write("            <button class=\"b1\">选择</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"c1\">\r\n");
      out.write("            <img src=\"/resources/image1/04_1.png\" height=\"175px\" width=\"80%\"/>\r\n");
      out.write("            <p>松鼠鳜鱼</p>\r\n");
      out.write("            <p>苏菜</p>\r\n");
      out.write("            <p>价格:85元</p>\r\n");
      out.write("            <button class=\"b1\">选择</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"c1\">\r\n");
      out.write("            <img src=\"/resources/image1/04_2.png\" height=\"175px\" width=\"80%\"/>\r\n");
      out.write("            <p>盐水鸭</p>\r\n");
      out.write("            <p>苏菜</p>\r\n");
      out.write("            <p>价格:35元</p>\r\n");
      out.write("            <button class=\"b1\">选择</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"c1\">\r\n");
      out.write("            <img src=\"/resources/image1/05_1.png\" height=\"175px\" width=\"80%\"/>\r\n");
      out.write("            <p>东坡肉</p>\r\n");
      out.write("            <p>浙菜</p>\r\n");
      out.write("            <p>价格:68元</p>\r\n");
      out.write("            <button class=\"b1\">选择</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"c1\">\r\n");
      out.write("            <img src=\"/resources/image1/05_2.png\" height=\"175px\" width=\"80%\"/>\r\n");
      out.write("            <p>南瓜盅八宝饭</p>\r\n");
      out.write("            <p>浙菜</p>\r\n");
      out.write("            <p>价格:15元</p>\r\n");
      out.write("            <button class=\"b1\">选择</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"c1\">\r\n");
      out.write("            <img src=\"/resources/image1/06_1.png\" height=\"175px\" width=\"80%\"/>\r\n");
      out.write("            <p>佛跳墙</p>\r\n");
      out.write("            <p>闽菜</p>\r\n");
      out.write("            <p>价格:288元</p>\r\n");
      out.write("            <button class=\"b1\">选择</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"c1\">\r\n");
      out.write("            <img src=\"/resources/image1/06_2.png\" height=\"175px\" width=\"80%\"/>\r\n");
      out.write("            <p>沙县拌面</p>\r\n");
      out.write("            <p>闽菜</p>\r\n");
      out.write("            <p>价格:12元</p>\r\n");
      out.write("            <button class=\"b1\">选择</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"c1\">\r\n");
      out.write("            <img src=\"/resources/image1/07_1.png\" height=\"175px\" width=\"80%\"/>\r\n");
      out.write("            <p>剁椒鱼头</p>\r\n");
      out.write("            <p>湘菜</p>\r\n");
      out.write("            <p>价格:50元</p>\r\n");
      out.write("            <button class=\"b1\">选择</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"c1\">\r\n");
      out.write("            <img src=\"/resources/image1/07_2.png\" height=\"175px\" width=\"80%\"/>\r\n");
      out.write("            <p>牛肉粉</p>\r\n");
      out.write("            <p>湘菜</p>\r\n");
      out.write("            <p>价格:16元</p>\r\n");
      out.write("            <button class=\"b1\">选择</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"c1\">\r\n");
      out.write("            <img src=\"/resources/image1/08_1.png\" height=\"175px\" width=\"80%\"/>\r\n");
      out.write("            <p>火腿炖甲鱼</p>\r\n");
      out.write("            <p>徽菜</p>\r\n");
      out.write("            <p>价格:125元</p>\r\n");
      out.write("            <button class=\"b1\">选择</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"c1\">\r\n");
      out.write("            <img src=\"/resources/image1/08_2.png\" height=\"175px\" width=\"80%\"/>\r\n");
      out.write("            <p>黄山炖鸽</p>\r\n");
      out.write("            <p>徽菜</p>\r\n");
      out.write("            <p>价格:45元</p>\r\n");
      out.write("            <button class=\"b1\">选择</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <table class=\"c2\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <input type=\"image\" id=\"a2\" src=\"/resources/image1/9.jpg\"/>\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>联系客服</td>\r\n");
      out.write("            <td>开放平台</td>\r\n");
      out.write("            <td>法律声明</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>淘宝网</td>\r\n");
      out.write("            <td>天猫</td>\r\n");
      out.write("            <td>聚划算</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>支付宝</td>\r\n");
      out.write("            <td>虾米</td>\r\n");
      out.write("            <td>钉钉</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>廉政举报</td>\r\n");
      out.write("            <td>阿里巴巴</td>\r\n");
      out.write("            <td>UC</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</nav>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
