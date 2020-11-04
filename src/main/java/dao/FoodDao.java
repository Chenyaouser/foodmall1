package dao;

import pojo.Food;

import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodDao {


    //写一个添加数据的方法用于增删改查

    public List<Food> findALLFoodsInfo(){
        List<Food> list = new ArrayList<>();
        //获得数据库连接对象
        Connection conn = DBUtil.getConn();
        //写sql
        String sql = "select * from tb_food";

        try {
            //给问号赋值
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            //处理结果集
            while(rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                String type = rs.getString("type");
                String price = rs.getString("price");

                Food f = new Food();
                f.setId(id);
                f.setName(name);
                f.setType(type);
                f.setPrice(price);
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

    //根据id删除数据
    public int deleteUserById(String id){
        int row = 0;
        Connection conn = DBUtil.getConn();
        String sql = "delete from tb_food where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //赋值
            ps.setInt(1,Integer.parseInt(id));
            //执行
             row = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return row;
    }

    //根据id查找
    public Food findFoodInfo(String id){
        Food food = null;
        Connection conn = DBUtil.getConn();
        //sql
        String sql = "select * from tb_food where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,Integer.parseInt(id));
            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                int foodid = rs.getInt("id");
                String name = rs.getString("name");
                String type = rs.getString("type");
                String price = rs.getString("price");
                //封装
                 food = new Food();
                food.setId(foodid);
                food.setName(name);
                food.setType(type);
                food.setPrice(price);

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
        return food;
    }

    //修改
    public int toUpdateFoodInfo(String id,String name,String type,String price){
        Connection conn = DBUtil.getConn();
        int row=0;
        String sql= "update tb_food set name=?,type=?,price=? where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,type);
            ps.setString(3,price);
            ps.setInt(4,Integer.parseInt(id));
            row = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return row;
    }

    //添加
    public int addFoodInfo(Food f){
        Connection conn1 =null;
        PreparedStatement ps= null;
        int row= 0;
        try {
         conn1 = DBUtil.getConn();
        System.out.println("conn:"+conn1);
        String sql = "insert into tb_food(id,name,type,price) values(null,?,?,?)";

            ps = conn1.prepareStatement(sql);
            ps.setString(1,f.getName());
            ps.setString(2,f.getType());
            ps.setString(3,f.getPrice());

            row=ps.executeUpdate();
 
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return row;
    }

    //模糊查询
    public List<Food> selectFoodNameForLike(String name){
        List<Food> list = new ArrayList<>();
        Connection conn = DBUtil.getConn();
        String sql = "Select * from tb_food where name like '%"+ name +"%'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1,name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Integer id= rs.getInt("id");
                String name1=rs.getString("name");
                String type=rs.getString("type");
                String price=rs.getString("price");

                Food f1 = new Food();
                f1.setId(id);
                f1.setName(name1);
                f1.setType(type);
                f1.setPrice(price);

                list.add(f1);


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
