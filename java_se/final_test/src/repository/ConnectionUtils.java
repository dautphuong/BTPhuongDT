package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtils {
    public static final String HOSTNAME = "localhost";
    public static final String PORT = "1433";
    public static final String DATABASE = "Final_Test";
    public static final String USER = "sasasa";
    public static final String PW = "fadn2021";

    public static Connection getConnection() {
        Connection conn = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";databaseName=" + DATABASE;
            conn = DriverManager.getConnection(url, USER, PW);
//            System.out.println("KET NOI THANH CONG");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("KET NOI THAT BAI");
            e.printStackTrace();
        }
        return conn;
    }

}
