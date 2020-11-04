package controller;

import com.alibaba.fastjson.JSONObject;
import dao.FoodDao;
import pojo.Food;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "UpdateUserServlet",urlPatterns = "/findFoodForUpdateFoodById")
public class UpdateFoodServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        //调用dao方法
        FoodDao foodDao = new FoodDao();
        Food food = foodDao.findFoodInfo(id);
        //转json字符串---重点
        String json = JSONObject.toJSONString(food);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(json);



    }
}
