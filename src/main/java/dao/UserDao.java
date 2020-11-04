package dao;
import pojo.User;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    //写一个添加数据的方法用于增删改查
    public int addUserInfo(String name,String password){
        //获得数据库连接对象
        Connection conn = DBUtil.getConn();
        PreparedStatement ps = null;
        int row = 0;
        //写sql
        String sql = "insert into tb_user1(id,name,password) values(null,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            //给问号赋值
            ps.setString(1,name);
            ps.setString(2,password);

            row = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return row;
    }

    //封装一个方法根据用户名查询当前用户是否存在
    public User findUserByUserName(String name) {
        //获取数据库连接对象
        Connection conn = DBUtil.getConn();
        User user = null;
        //编写sql
        String sql = "select * from tb_user1 where name=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            // 给问号赋值
            ps.setString(1, name);

            //执行
            ResultSet r = ps.executeQuery();

            if (r.next()) {
                int id = r.getInt("id");
                String username = r.getString("name");
                String password = r.getString("password");
                //得到结果封装到User对象
                //将从数据库拿到的这条数据封装到一个User对象
                user = new User();
                user.setId(id);
                user.setName(username);
                user.setPassword(password);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭连接
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return user;

    }
}
