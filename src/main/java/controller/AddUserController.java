package controller;

import dao.FoodDao;
import pojo.Food;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddUserController",urlPatterns = "/addFoodInfo")
public class AddUserController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String price = req.getParameter("price");

        Food f = new Food();
        f.setName(name);
        f.setType(type);
        f.setPrice(price);

        FoodDao foodDao = new FoodDao();
        int row = foodDao.addFoodInfo(f);
        if (row>0){
            resp.sendRedirect("/findAllFoods");
        }else {
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }

    }
}
