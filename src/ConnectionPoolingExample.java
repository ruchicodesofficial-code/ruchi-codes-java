import java.sql.*;
import java.util.ArrayList;

public class ConnectionPoolingExample {

            private static final String URL = "jdbc:mysql://localhost:3306/demo";
            private static final String USER = "root";
            private static final String PASSWORD = "12345";

            private static final int INITIAL_POOL_SIZE = 5;

            private static ArrayList<Connection> pool = new ArrayList<>();

            // create connections
            static {
                try {
                    for(int i = 0; i < INITIAL_POOL_SIZE; i++) {
                        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                        pool.add(con);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // get connection from pool
            public static Connection getConnection() {
                if(pool.size() > 0) {
                    return pool.remove(0);
                }
                return null;
            }

            // return connection to pool
            public static void releaseConnection(Connection con) {
                pool.add(con);
            }
        }
