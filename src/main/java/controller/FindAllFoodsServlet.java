package controller;

import dao.FoodDao;
import pojo.Food;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FindAllFoodsServlet",urlPatterns = "/findAllFoods")
public class FindAllFoodsServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        FoodDao dao = new FoodDao();
        List<Food> list = dao.findALLFoodsInfo();
            //发送请求
        req.setAttribute("list",list);
        //转发页面
            req.getRequestDispatcher("form.jsp").forward(req,resp);

    }
}
