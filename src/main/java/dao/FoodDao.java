package dao;

import pojo.Food;
import pojo.User;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodDao {
    //写一个添加数据的方法用于增删改查
    public List<Food> querryfoodInfo() {
        //获得数据库连接对象
        Connection conn = DBUtil.getConn();
        //写sql
        String sql = "select * from tb_food";
        List<Food> list = null;
        try {
            //给问号赋值
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            //创建对象集合
            list = new ArrayList<>();
            //处理结果集
            while(rs.next()) {

                Food f = new Food();
                f.setId(rs.getInt("id"));
                f.setName(rs.getString("name"));
                f.setType(rs.getString("type"));
                f.setPrice(rs.getString("price"));
                list.add(f);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

}
