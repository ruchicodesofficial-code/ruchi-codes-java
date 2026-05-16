import java.sql.*;
public class BatchExample {
    public static void main(String[] args) {
        try{
            //1. load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. create connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8000/jdbc_demo",
                    "root",
                    "12345");

            //3. create statement
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while(rs.next()){
                System.out.println(rs.getInt("id")+" - "+rs.getString("name"));
            }
            /* PreparedStatement ps = con.prepareStatement("UPDATE students SET name = ? WHERE id =?");
             String [] name = {
                     "Ruchi", "Aman", "Neha", "Raj", "Simran",
                     "Karan", "Pooja", "Amit","Tiya"
             };
             for(int i=1;i< name.length;i++){
                 ps.setString(1,name[i]);
                 ps.setInt(2,i);
                 ps.addBatch();
             }
*/
            //4. add queries to batch
            //stmt.addBatch("INSERT INTO students VALUES(6,'Rose')");
            //stmt.addBatch("INSERT INTO students VALUES (7,'Ana')");

//            ps.setInt(1,8);
//            ps.setString(2,"Ridaa");
//            ps.addBatch();
//
//            ps.setInt(1,9);
//            ps.setString(2,"Jiya");
           //ps.addBatch();
            //5. execute batch
            //int[] result = stmt.executeBatch();

          //  int[] result = ps.executeBatch();
            //6. print result
//            for(int i:result){
//                System.out.println("Rows affected: "+i);
//            }
            //7. close connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
