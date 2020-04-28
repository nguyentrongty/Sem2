package lession23;

import java.sql.*;

public class JdbcUpdateTest {

    public static void main(String[] args) {
        try (
                //Step 1: allocate a database connection object.
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", ""); //for MYSQL only
                //Step 2: Allocate a 'Statement' object in the connection.
                Statement stmt = conn.createStatement();
        ) {
            //Step 3 & 4: Execute a SQL Update via ExecuteUpdate()
            //Which returns an indicating the number of rows affected.
            //Increase the price by 7% and qty 1 of for id= 1001.
            String strUpdate = "update books set price = price*0.7, qty = qty + 1 where id = 1001";
            System.out.println("The SQL statement is: " + strUpdate + "\n"); //Echo for debugging.
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " Records affected.\n");

            //Step 3 & 4: Issue a Select to check the Update.
            String strSelect = "select * from books where id = 1001";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) {
                System.out.println(rset.getInt("id") + ","
                                + rset.getString("author") + ","
                                + rset.getString("title") + ","
                                + rset.getDouble("price") + ","
                                + rset.getInt("qty")) ;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
