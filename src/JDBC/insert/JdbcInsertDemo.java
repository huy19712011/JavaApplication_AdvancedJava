/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.insert;

import JDBC.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author huynq
 */
public class JdbcInsertDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost:3306", "demo", "admin", "123456");

        try {

            // get a connection to database
            myConn = dcm.getConnection();
            System.out.println("Database connection successful!");

            // create a statement
            myStmt = myConn.createStatement();

            // execute sql query: insert row
            String sql = """
                         insert into employees (last_name, first_name, email, department, salary)
                         values ('John', 'Doe', 'jdoe@gmail.com', 'HR', 36000.00);
                         """;
            int rowsAffected = myStmt.executeUpdate(sql);

            // process the resultset
            myRs = myStmt.executeQuery("select * from employees");

            System.out.println("Rows affected: " + rowsAffected);
            while (myRs.next()) {
                System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
            }

        } catch (SQLException e) {

            e.printStackTrace();

        } finally {

            if (myRs != null) try {
                myRs.close();
            } catch (SQLException ignore) {
            }
            if (myStmt != null) try {
                myStmt.close();
            } catch (SQLException ignore) {
            }
            if (myConn != null) try {
                myConn.close();
            } catch (SQLException ignore) {
            }

        }
    }

}
