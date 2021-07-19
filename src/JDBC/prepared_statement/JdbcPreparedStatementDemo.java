/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.prepared_statement;

import JDBC.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author huynq
 */
public class JdbcPreparedStatementDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Connection myConn = null;
        PreparedStatement myStmt = null;
        ResultSet myRs = null;

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost:3306", "demo", "admin", "123456");

        try {

            // get a connection to database
            myConn = dcm.getConnection();
            System.out.println("Database connection successful!");

            // sql query for prepared statement
            String sql = """
                         select * from employees
                         where salary > ? and department = ?;
                         """;

            // set the parameters
            myStmt = myConn.prepareStatement(sql);
            myStmt.setDouble(1, 80_000.00);
            myStmt.setString(2, "Legal");

            myRs = myStmt.executeQuery();

            while (myRs.next()) {
                System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name") + ": " + myRs.getDouble("salary"));
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
