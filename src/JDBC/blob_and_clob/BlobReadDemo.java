/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.blob_and_clob;

import JDBC.DatabaseConnectionManager;
import java.io.File;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author huynq
 */
public class BlobReadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        FileOutputStream output = null;
        InputStream input = null;

        DatabaseConnectionManager dcm
                = new DatabaseConnectionManager("localhost:3306", "demo", "admin", "123456");

        try {

            // get a connection to database
            myConn = dcm.getConnection();

            // create statement
            myStmt = myConn.createStatement();

            // sql query
            String sql = """
                         select resume
                         from employees
                         where id=1
                         """;

            // Execute statement
            myRs = myStmt.executeQuery(sql);

            // handle to file
            File theFile = new File("resource/resume_from_db.pdf");
            try {
                output = new FileOutputStream(theFile);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BlobReadDemo.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (myRs.next()) {

                input = myRs.getBinaryStream("resume");
                System.out.println("Reading resume from database...");
                System.out.println(sql);

                byte[] buffer = new byte[1024];
                while (input.read(buffer) > 0) {
                    if (output != null) {
                        output.write(buffer);
                    }
                }

                System.out.println("\nSaved to file: " + theFile.getAbsolutePath());

                System.out.println("\nCompleted successfully!");
            }

        } catch (SQLException e) {

            e.printStackTrace();

        } catch (IOException ex) {
            Logger.getLogger(BlobReadDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (input != null) try {
                input.close();
            } catch (IOException ignore) {
            }
            if (output != null) try {
                output.close();
            } catch (IOException ignore) {
            }
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
