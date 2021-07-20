/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.blob_and_clob;

import JDBC.DatabaseConnectionManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author huynq
 */
public class BlobWriteDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Connection myConn = null;
        PreparedStatement myStmt = null;
//        ResultSet myRs = null;
        FileInputStream input = null;

        DatabaseConnectionManager dcm
                = new DatabaseConnectionManager("localhost:3306", "demo", "admin", "123456");

        try {

            // get a connection to database
            myConn = dcm.getConnection();
            System.out.println("Database connection successful!");

            // sql query for prepared statement
            String sql = """
                         update employees
                         set resume=?
                         where id=1
                         """;

            // set the parameters
            myStmt = myConn.prepareStatement(sql);
            File theFile = new File("resource/sample_resume.pdf");
            System.out.println("Reading input file: " + theFile.getAbsolutePath());
            try {
                input = new FileInputStream(theFile);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BlobWriteDemo.class.getName()).log(Level.SEVERE, null, ex);
            }

            myStmt.setBinaryStream(1, input);

            myStmt.executeUpdate();
            System.out.println("\nCompleted successfully!");


        } catch (SQLException e) {

            e.printStackTrace();

        } finally {

            if (input != null) try {
                input.close();
            } catch (IOException ignore) {
            }
//            if (myRs != null) try {
//                myRs.close();
//            } catch (SQLException ignore) {
//            }
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
