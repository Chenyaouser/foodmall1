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
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        List<Food> foods = foodDao.querryfoodInfo();
        System.out.println(foods);
        req.getSession().setAttribute("foods",foods);
//        resp.sendRedirect("form.jsp");
        req.getRequestDispatcher("/main.jsp").forward(req,resp);

    }




}
