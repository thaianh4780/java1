package Chuong5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;
//import java.sql.*mssql-jdbc-12.2.0.jre8.jar;

public class DataBaseUtil {

    private static String db_url = "jdbc:mysql://localhost:3306/sinhvien_db";
    private static String username = "root";
    private static String password = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(db_url,username,password);
    }
}
