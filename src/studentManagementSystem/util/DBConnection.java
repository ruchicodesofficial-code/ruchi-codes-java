package studentManagementSystem.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:8000/jdbc_project";
    private static final String USERNAME = "root";
    private static  final String PASSWORD = "12345";
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL,
                    USERNAME,
                    PASSWORD);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }
}
