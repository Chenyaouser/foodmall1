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

@WebServlet(name = "SelectFoodNameForLike", urlPatterns = "/selectFoodNameForLike")
public class SelectFoodNameForLike extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        String name = req.getParameter("name");

        FoodDao foodDao = new FoodDao();
        List<Food> list = foodDao.selectFoodNameForLike(name);
        System.out.println(list.toString());
        req.setAttribute("list",list);
        req.getRequestDispatcher("form.jsp").forward(req,resp);
    }
}
