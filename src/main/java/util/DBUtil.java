package util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
    private static String username;
    private static String password;
    private static String url;
    private static String driver;


    static {
        try {
            InputStream in = DBUtil.class.getClassLoader().getResourceAsStream("db.properties");
            Properties p = new Properties();
            System.out.println("in:"+in);
            p.load(in);

            username = p.getProperty("db.username");
            password = p.getProperty("db.password");
            url = p.getProperty("db.url");
            driver = p.getProperty("db.driver");

            System.out.println(username);
            System.out.println(password);
            System.out.println(url);
            System.out.println(driver);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //封装方法
    public  static Connection getConn() {

        Connection conn = null;

        try {
            //加载驱动
            Class.forName(driver);
             conn = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

}
