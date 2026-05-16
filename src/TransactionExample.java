import java.sql.*;
public class TransactionExample {
    public static void main(String[] args) {
        Connection con = null;
        Savepoint sp = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:8000/transaction",
                    "root",
                    "12345");
            con.setAutoCommit(false);
            // SELECT Before transaction
            System.out.println("Before Transaction: ");
            Statement stmt = con.createStatement();
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM accounts");
            while (rs1.next()){
                System.out.println(rs1.getInt("id")+" | "+rs1.getString("name")
                +" | "+rs1.getInt("balance"));
            }

            PreparedStatement debit = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
            PreparedStatement credit = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
            //debit
            debit.setInt(1,1000);
            debit.setInt(2,1);
            debit.executeUpdate();

            sp = con.setSavepoint("After_Debit");

            int x = 10/0;
            //credit
            credit.setInt(1,1000);
            credit.setInt(2,2);
            credit.executeUpdate();

            //save changes
            con.commit();
            System.out.println("Transaction Successful!");
        } catch (Exception e) {
            try {
                con.rollback();
                System.out.println("Transaction Failed");
            } catch (SQLException ex) {
                e.printStackTrace();
            }
        }
        finally {
            try {
                con.setAutoCommit(true);
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        try{
            // SELECT after transaction
            Statement stmt2 = con.createStatement();
            ResultSet rs2 = stmt2.executeQuery("SELECT * FROM accounts");

            while (rs2.next()){
                System.out.println(rs2.getInt("id")+" | "+rs2.getString("name")+" | "
                        +rs2.getInt("balance"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
