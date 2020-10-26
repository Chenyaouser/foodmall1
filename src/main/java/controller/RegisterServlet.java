package controller;

import dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet",urlPatterns = "/toReg")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理乱码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        //接收参数
        String name = req.getParameter("name");
        String password = req.getParameter("password");


        System.out.println(name);
        System.out.println(password);


        //连接数据库
        UserDao userDao = new UserDao();
        int row = userDao.addUserInfo(name,password);
        //通过响应对象获取输出流
        PrintWriter pw = resp.getWriter();
        //输出的内容格式和字符编码
        resp.setContentType("text/html;charset=utf-8");

        if (row>=1){
//            pw.println("添加数据成功");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }else{
            req.setAttribute("msg","服务器异常!请稍后重试...");
            req.getRequestDispatcher("error.jpg").forward(req,resp);
        }

    }


}
