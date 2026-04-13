import java.sql.*;

public class DatabaseMetaDataDemo {
        public static void main(String[] args) {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:8000/jdbc_demo",
                        "root",
                        "12345"
                );
             DatabaseMetaData dbmd = con.getMetaData();
             //BASIC DATABASE INFO
                System.out.println("Database Name: "+ dbmd.getDatabaseProductName());
                System.out.println("Database version: "+dbmd.getDatabaseProductVersion());
                System.out.println("Driver Name: "+dbmd.getDriverName());
                System.out.println("Driver Version: "+dbmd.getDriverVersion());

                //USER AND URL INFO
                System.out.println("User Name: "+dbmd.getUserName());
                System.out.println("URL: "+dbmd.getURL());

                //GET ALL TABLES
                System.out.println("\n------Tables in Database-------");
                ResultSet tables = dbmd.getTables(null,null,"%",new String[]{"TABLE"});
                while(tables.next()){
                   String tableName = tables.getString("TABLE_NAME");
                    System.out.println(tableName);
                }

                //GET COLUMNS OF AN TABLE
                System.out.println("\n------Columns in Database-------");
                ResultSet column = dbmd.getColumns(null,null,"students",null);
                while(column.next()){
                    String colName = column.getString(4);
                    String colType= column.getString(6);
                    System.out.println(colName+" "+colType);
                }
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
