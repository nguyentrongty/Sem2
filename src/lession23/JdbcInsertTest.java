package lession23;

import java.sql.*;

public class JdbcInsertTest {

    public static void main(String[] args) {
        try (
            //Step1: Allocate a database "Connection" object.
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                    "root",""); //for MYSQL only.
            //Step2: Allocate a 'Statement' object in the connection.
            Statement stmt = conn.createStatement();
        ) {
            //Step 3 & 4:Execute a SQL INSERT|DELETE statement via executeUpdate().
            // which Returns an int indicating the number of rows affected.

            //Delete records with id >= 3000 and id < 4000.
            String sqlDelete = "delete from books where id >= 3000 and id < 4000";
            System.out.println("The SQl Statement is: " + sqlDelete + "\n"); //Echo for debugging.
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " Records delete.\n");

            //INSERT a Records.
            String sqlInsert = "insert Into books values ( 3001 , 'Gone Fishing', 'Kumar', 11.11, 11 )";
            System.out.println("The SQL statement is: " + sqlInsert + "\n"); //Echo for debugging.
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " Records Inserted.\n");

            //INSERT multiple records.
            sqlInsert = "insert into books values "
                    + "(3002 , 'Gone Fishing 2', 'Kumar', 22.22, 22),"
                    + "(3003 , 'Gone Fishing 3', 'Kumar', 33.33, 33)";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " Records Inserted.\n");

            //INSERT a partial records.
            sqlInsert = "insert Into books ( id, title, author) values ( 3004, 'Fishing 101', 'Kumar')";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " Records Inserted.\n");

            //Issue a SELECT to check the changes.
            String strSELECT = "select * from books";
            System.out.println("The SQL statement is :" + strSELECT + "\n");
            ResultSet rset = stmt.executeQuery(strSELECT);
            while (rset.next()) {
                System.out.println(rset.getInt("id") + ", "
                             + rset.getString("author") + ", "
                             + rset.getString("title") + ", "
                             + rset.getDouble("price") + ", "
                             + rset.getInt("qty"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
