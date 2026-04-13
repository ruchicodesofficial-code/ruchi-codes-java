import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcFirstProgram {
    public static void main(String[] args) {
        try{

            //1. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. Create connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8000/jdbc_demo",
                    "root","12345");

            //3. Create statement
            Statement stmt = con.createStatement();
            //4. Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            //5. Process Result
            while (rs.next()){
                System.out.println(rs.getInt("id")+" "+
                        rs.getString("name"));

            }
            // 6. close connection
            con.close();
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
