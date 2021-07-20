/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.database_configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 *
 * @author huynq
 */
public class ConnectionDemoUsingCofigFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        try {

            // 1. Load the properties file
            Properties props = new Properties();
            props.load(new FileInputStream("src/JDBC/database_configuration/db.properties"));

            // 2. Read the props
            String theUser = props.getProperty("user");
            String thePassword = props.getProperty("password");
            String theDbUrl = props.getProperty("dburl");

            System.out.println("Connecting to database...");
            System.out.println("Database URL: " + theDbUrl);
            System.out.println("User: " + theUser);

            // 3. Get a connection to database
            myConn = DriverManager.getConnection(theDbUrl, theUser, thePassword);

            System.out.println("\nConnection successful!\n");

            // 4. Create a statement
            myStmt = myConn.createStatement();

            // 5. Execute SQL query
            myRs = myStmt.executeQuery("select * from employees");

            // 6. Process the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
            }

        } catch (IOException | SQLException e) {
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
