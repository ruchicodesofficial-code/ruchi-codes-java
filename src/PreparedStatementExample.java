import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) {
        try{
            // 1. load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. create connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8000/jdbc_demo",
                    "root",
                    "12345"
            );

            //3. create preparedStatement
             String query = "DELETE FROM users WHERE id =? ";
            // String query = "INSERT INTO users(id,name) VALUES(?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            //4. set value
            ps.setInt(1,101);
//            ps.setInt(1,202);
//            ps.setString(2,"Jeet");

            //5. Execute Query
            //ResultSet rs = ps.executeQuery();
           int rows = ps.executeUpdate();
            //System.out.println(rows+" record inserted");
            System.out.println(rows+ " record deleted");
            //6. Process Result
//            while(rs.next()){
//                System.out.println("ID: "+ rs.getInt("id"));
//                System.out.println("Name: "+rs.getString("name"));
//         }

            //7. close connection
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
