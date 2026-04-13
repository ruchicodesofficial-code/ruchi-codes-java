import java.sql.*;
public class ResultSetMetaDataDemo {
    public static void main(String[] args) {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8000/jdbc_demo",
                    "root",
                    "12345");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            // get metadata
            ResultSetMetaData rsmd = rs.getMetaData();
            // get total number of column
            int columnCount = rsmd.getColumnCount();
            System.out.println("Total Columns: "+columnCount);

            for(int i=1;i<=columnCount;i++){
                System.out.println("Column Name: "+ rsmd.getColumnName(i));
                System.out.println("Column Type: "+rsmd.getColumnTypeName(i));
            }
            System.out.println("\n -----Table Data-----");
            while (rs.next()){
                for(int i=1;i<=columnCount;i++){
                    System.out.println(rs.getObject(i)+" ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
