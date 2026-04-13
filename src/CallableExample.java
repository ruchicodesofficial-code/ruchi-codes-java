
import java.sql.*;
public class CallableExample {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8000/company_db",
                    "root",
                    "12345");
//
//            CallableStatement cs = con.prepareCall("{call addEmployee(?,?,?,?)}");
//            cs.setInt(1,101);
//            cs.setString(2,"riya");
//            cs.setString(3,"IT");
//            cs.setDouble(4,50000);

            CallableStatement cs  = con.prepareCall("{call getEmployeeCount(?)}");
            cs.registerOutParameter(1,Types.INTEGER);
            cs.execute();
           int count = cs.getInt(1);
           System.out.println("Total employees: "+count);
           // System.out.println("Employee inserted using stored procedure");
            cs.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
