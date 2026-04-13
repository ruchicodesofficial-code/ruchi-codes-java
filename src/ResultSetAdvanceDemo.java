import java.sql.*;
public class ResultSetAdvanceDemo {
        public static void main(String[] args) {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:8000/jdbc_demo",
                        "root",
                        "12345"
                );
                Statement stmt = con.createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY
                );

                ResultSet rs = stmt.executeQuery("SELECT * FROM students");
                System.out.println("Last");
                rs.last();
                System.out.println(rs.getInt("id")+
                        " "+rs.getString("name"));

                System.out.println("First");
                rs.first();
                System.out.println(rs.getInt("id")+
                        " "+rs.getString("name"));

                System.out.println("Move to 2nd row");
                rs.absolute(2);
                System.out.println(rs.getInt("id")+
                        " "+rs.getString("name"));

                System.out.println("Previous");
                rs.previous();
                System.out.println(rs.getInt("id")+
                        " "+rs.getString("name"));
//                while(rs.next()){
//                    System.out.println(rs.getInt("id")+" "
//                            +rs.getString("name"));
//                }

                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


