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
    }
}
