/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.transaction_and_metadata;

import JDBC.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author huynq
 */
public class ResultSetDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DatabaseConnectionManager dcm
                = new DatabaseConnectionManager("localhost:3306", "demo", "admin", "123456");

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        try {

            myConn = dcm.getConnection();

            myStmt = myConn.createStatement();

            myRs = myStmt.executeQuery("select id, first_name, last_name, salary from employees");

            ResultSetMetaData metaData = myRs.getMetaData();

            // display info
            int columnCount = metaData.getColumnCount();
            System.out.println("Column count: " + columnCount);

            for (int column = 1; column <= columnCount; ++column) {
                System.out.println("Column name: " + metaData.getColumnName(column));
                System.out.println("Column type name: " + metaData.getColumnTypeName(column));
                System.out.println("Is Nullable: " + metaData.isNullable(column));
                System.out.println("Is Auto Increment: " + metaData.isAutoIncrement(column));
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
