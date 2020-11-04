package controller;

import dao.FoodDao;
import pojo.Food;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ToUpdateFoodServlet",urlPatterns = "/toUpdateFoodInfo")
public class ToUpdateFoodServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        //接收参数
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String price = req.getParameter("price");

        FoodDao dao = new FoodDao();
        int row = dao.toUpdateFoodInfo(id,name,type,price);
        if (row>0){
            resp.sendRedirect("/findAllFoods");
        }else {
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }

    }
}
