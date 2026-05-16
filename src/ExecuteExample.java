import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteExample {
        public static void main(String[] args) {
            try{

                //2. Create connection
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8000/jdbc_demo",
                        "root","12345");

                //3. Create statement
                Statement stmt = con.createStatement();
                //4. Execute Query
                String query = "SELECT * FROM students";
                 boolean isResultSet = stmt.execute(query);
                 if(isResultSet){
                     ResultSet rs = stmt.getResultSet();
                     while (rs.next()){
                         System.out.println(rs.getInt("id")+" "+
                                 rs.getString("name"));

                     }
                 }else{
                     int count = stmt.getUpdateCount();
                     System.out.println(count+" row(s) affected");
                 }


                // 6. close connection
                con.close();
            }catch (Exception e){
                e.printStackTrace();

            }
        }
    }

