import java.sql.*;
public class StatementExample {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8000/jdbc_demo",
                    "root",
                    "12345"
            );
            Statement stmt = con.createStatement();
            //-------------- SELECT
            ResultSet rs = stmt.executeQuery("SELECT*FROM students");

            while(rs.next()){
                System.out.println(rs.getInt("id")+" "
                        +rs.getString("name"));
            }
            //------------------- INSERT------------------
//            String query = "INSERT INTO students(id,name) VALUES (3, 'Rati')";
//            int rowAffected = stmt.executeUpdate(query);
//            System.out.println(rowAffected+"row(s) inserted ");
            //------------ UPDATE
//            String query = "UPDATE   students SET name = 'Rahul' WHERE id = 3";
//            int row= stmt.executeUpdate(query);
//           System.out.println(row+" row(s) updated ");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
