/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.stored_procedure;

import JDBC.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.CallableStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author huynq
 */
public class StoredProcedure_WithInOutParameters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DatabaseConnectionManager dcm
                = new DatabaseConnectionManager("localhost:3306", "demo", "admin", "123456");

        Connection myConn = null;
        CallableStatement myStmt = null;
//        ResultSet myRs = null;

        try {

            // get connection
            myConn = dcm.getConnection();

            // create callable statement
            myStmt = myConn.prepareCall("{ call greet_the_department(?) }");

            // set parameters
            String department = "Engineering";
            myStmt.registerOutParameter(1, Types.VARCHAR);
            myStmt.setString(1, department);

            // call statement
            myStmt.execute();

            // get the value of INOUT parameter
            String result = myStmt.getString(1);
            System.out.println("Result: " + result);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

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
