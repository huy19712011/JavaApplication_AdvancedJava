/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.advanced_batch;

import JDBC.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author huynq
 */
public class BatchDemo {

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
            String sql1 = """
                         insert into employees (first_name, last_name, email, department, salary)
                         values ('John1', 'Doe1', 'jdoe1@gmail.com', 'HR', 36000.00);
                         """;


            String sql2 = """
                         insert into employees (first_name, last_name, email, department, salary)
                         values ('John2', 'Doe2', 'jdoe2@gmail.com', 'HR', 36000.00);
                         """;

            String sql3 = """
                         update employees
                         set email = 'updated@gmail.com'
                         where email = 'jdoe2@gmail.com'
                         """;


            myStmt.addBatch(sql1);
            myStmt.addBatch(sql2);
            myStmt.addBatch(sql3);

            int[] results = myStmt.executeBatch();

            for (int i = 0; i < results.length; ++i) {
                System.out.println(results[i]);
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
