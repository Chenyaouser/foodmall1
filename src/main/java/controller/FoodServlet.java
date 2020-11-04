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

@WebServlet(name="FoodServlet",urlPatterns = "/foodInfo")
public class FoodServlet extends HttpServlet {
    FoodDao foodDao = new FoodDao();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理乱码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        //接收参数
        List<Food> list = foodDao.findALLFoodsInfo();
        for (Food food : list) {
            System.out.println(food.toString());
        }

        req.setAttribute("list", list);
        req.getRequestDispatcher("form.jsp").forward(req, resp);
    }
}




