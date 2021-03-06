package controller;

import dao.UserDao;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet",urlPatterns = "/toLog")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决中文乱码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        //接收数据
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        //根据用户名查找当前用户是否存在
        UserDao dao=new UserDao();
        User user=dao.findUserByUserName(name);
        //得到输出流
        PrintWriter pw=resp.getWriter();
        //告诉浏览器服务端输出的内容
        resp.setContentType("text/html;charset=utf-8");
        //判断user对象
        if(user==null){
//            req.setAttribute("msg","该用户没有注册");
//            req.getRequestDispatcher("login.jsp").forward(req,resp);
            pw.println(200);//1代表用户不存在
//            pw.println("用户名不存在");
            return;
        }else{
            //比较用户名和密码
            if(user.getName().equals(name) && user.getPassword().equals(password)){
//                req.setAttribute("name1",name);
//                req.getRequestDispatcher("main.jsp").forward(req,resp);
//                pw.println("登录成功");
                //存储数据
                HttpSession httpSession=req.getSession();
                //将用户名绑定到session中
                httpSession.setAttribute("name",name);
                pw.println(201);//表示登录成功
//                pw.println("登录成功");
            }else{
//                req.setAttribute("msg","用户名或者密码错误");
//                req.getRequestDispatcher("login.jsp").forward(req,resp);
//                pw.println("用户名或者密码错误");
                pw.println(202);//表示用户名或者密码错误
            }

        }





    }
}
