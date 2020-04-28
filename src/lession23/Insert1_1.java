package lession23;

import java.sql.*;
import java.util.Scanner;

public class Insert1_1 {

    public static void main(String[] args) {
     //  ex1_1();
     //   ex1_2();
     //  ex1_3();
     ex1_4();
    }

    private static void ex1_1() {
        try(
            //Step1: Allocate a database "Connection" object.
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                    "root", ""); //for MYSQL only.
            //Step2: Allocate a 'Statement' object in the connection.
            Statement stmt = conn.createStatement();
        ) {
            String sqlDelete = "delete from books where id > 8000";
            System.out.println("The SQl Statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " Records delete.\n");

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
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    private static void ex1_2() {
        try(
                //Step1: Allocate a database "Connection" object.
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", ""); //for MYSQL only.
                //Step2: Allocate a 'Statement' object in the connection.
                Statement stmt = conn.createStatement();
        ) {
            //INSERT multiple records.
            String sqlInsert = "insert into books values"
                    + "(8001 , 'Java core', 'Dang Thi Kim', 15.55, 55),"
                    + "(8002 , 'Java advanced', 'Jame Nguyen', 25.55, 65)";
            System.out.println("The SQL Statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " Records Inserted.\n");

            sqlInsert = "insert Into books ( id, title, author) values ( 2001, 'Fishing 890', 'trison')";
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

    private static void ex1_3() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            //Xóa Sách theo id do người dùng nhập vào.
            Scanner input = new Scanner(System.in);
            System.out.println("Enter id books you want delete: ");
            int search = input.nextInt();
            String sqlDelete = "delete from books where id" + search;
            System.out.println("The SQL Statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " Records delete.\n");

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

    private static void ex1_4() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter ID: ");
            int search=input.nextInt();
            String strSelect =("select * from books where id ='"+search+"'");
            System.out.println("The SQL statement is: "+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("These books belong to the ID: "+search);
            int rowCount=0;
            while (rset.next()) {
                String id = rset.getString("id");
                String author = rset.getString("author");
                String title = rset.getString("title");
                String price = rset.getString("price");
                String qty = rset.getString("qty");
                System.out.println(id + "," + author + "," + title + "," + price + "," + qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
