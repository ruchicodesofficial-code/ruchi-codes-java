import java.sql.*;

public class UpdatableResultSetDemo {
        public static void main(String[] args) {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:8000/jdbc_demo",
                        "root",
                        "12345"
                );
                //updatable statement
                Statement stmt = con.createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE
                );

                ResultSet rs = stmt.executeQuery("SELECT*FROM students");
                rs.moveToInsertRow();
                rs.updateInt("id", 5);
                rs.updateString("name","Yogita");
                rs.insertRow();
                System.out.println("Row inserted successfully");

                //update data
                while(rs.next()){
//                   if(rs.getInt("id")==1){
//                       rs.updateString("name","Anvi");
//                       rs.updateRow(); //save to DB
                    System.out.println(rs.getInt("id")+" "+rs.getString("name"));
                   }
//                }
//                System.out.println("Data successfully updated!");

                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

