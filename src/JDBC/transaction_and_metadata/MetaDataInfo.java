/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.transaction_and_metadata;

import JDBC.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.DatabaseMetaData;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author huynq
 */
public class MetaDataInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DatabaseConnectionManager dcm
                = new DatabaseConnectionManager("localhost:3306", "demo", "admin", "123456");

        Connection myConn = null;

        try {

            myConn = dcm.getConnection();
            DatabaseMetaData metaData = myConn.getMetaData();

            // display info
            System.out.println("Product name: " + metaData.getDatabaseProductName());
            System.out.println("Product version: " + metaData.getDatabaseProductVersion());

            System.out.println("JDBC drive name: " + metaData.getDriverName());
            System.out.println("JDBC drive version: " + metaData.getDriverVersion());

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

//            if (myRs != null) try {
//                myRs.close();
//            } catch (SQLException ignore) {
//            }
//            if (myStmt != null) try {
//                myStmt.close();
//            } catch (SQLException ignore) {
//            }
            if (myConn != null) try {
                myConn.close();
            } catch (SQLException ignore) {
            }

        }

    }

}
