package jdbc;

import java.sql.*;

/**
 * Created by csu118 on 2016/12/12.
 */
public class DatabaseConnection {

    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String url = "jdbc:mysql://localhost:3306/personnel_management";
    public static final String user = "root";
    public static final String password = "zhang123";
    private Connection conn = null;

    public DatabaseConnection() {
        try {

            Class.forName(driver);
            this.conn = DriverManager.getConnection(url, user, password);

        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return this.conn;
    }

    public void closed() {
        if(this.conn != null) {
            try {
                this.conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

//    public static void main(String[] args) {
//        DatabaseConnection onsdfg = new DatabaseConnection();
//    }
}
