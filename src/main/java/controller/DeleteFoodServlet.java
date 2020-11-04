package controller;

import dao.FoodDao;
import dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteFoodServlet",urlPatterns = "/deleteFoodById")
public class DeleteFoodServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        //执行删除操作
        FoodDao foodDao = new FoodDao();
        int row = foodDao.deleteUserById(id);
        if (row>0){
        //成功
            resp.sendRedirect("/findAllFoods");
        }else{
        //失败
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }


    }
}
