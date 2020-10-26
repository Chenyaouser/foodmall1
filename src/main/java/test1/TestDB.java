package test1;

import dao.FoodDao;
import pojo.Food;
import util.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestDB {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtil.getConn();
        System.out.println(conn);
        FoodDao foodDao = new FoodDao();

        List<Food> list = foodDao.querryfoodInfo();

        for (Food food : list) {
            System.out.println(food);
        }
    }
}
