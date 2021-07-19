/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.transaction_and_metadata;

import JDBC.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author huynq
 */
public class TransactionDemo {

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

            // get connection
            myConn = dcm.getConnection();

            // turn off auto commit
            myConn.setAutoCommit(false);

            // show salary BEFORE
            System.out.println("Salary BEFORE: ");
            showSalaries(myConn, "HR");
            showSalaries(myConn, "Engineering");

            // Transaction Step 1 - delete HR employees
            myStmt = myConn.createStatement();
            myStmt.executeUpdate("delete from employees where department = 'HR'");

            // Transaction Step 2 - set salaries to 300000 for all Engineering employees
            myStmt.executeUpdate("update employees set salary = 300000 where department = 'Engineering'");

            System.out.println("noTransaction steps are ready");

            //ask user if it is ok to save
            boolean ok = askUserIfOkToSave();

            if (ok) {
                // store in database
                myConn.commit();
                System.out.println("Transaction commited!");
            } else {
                // discard
                myConn.rollback();
                System.out.println("Transaction rolled back!");
            }

            // show salary AFTER
            System.out.println("Salaries AFTER:");
            showSalaries(myConn, "HR");
            showSalaries(myConn, "Engineering");

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


/**
	 * Prompts the user. Return true if they enter "yes", false otherwise
	 *
	 * @return
	 */
	private static boolean askUserIfOkToSave() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Is it okay to save?  yes/no: ");
		String input = scanner.nextLine();

		scanner.close();

		return input.equalsIgnoreCase("yes");
	}

	private static void showSalaries(Connection myConn, String theDepartment)
			throws SQLException {
		PreparedStatement myStmt = null;
		ResultSet myRs = null;

		System.out.println("Show Salaries for Department: " + theDepartment);

		try {
			// Prepare statement
			myStmt = myConn
					.prepareStatement("select * from employees where department=?");

			myStmt.setString(1, theDepartment);

			// Execute SQL query
			myRs = myStmt.executeQuery();

			// Process result set
			while (myRs.next()) {
				String lastName = myRs.getString("last_name");
				String firstName = myRs.getString("first_name");
				double salary = myRs.getDouble("salary");
				String department = myRs.getString("department");

				System.out.printf("%s, %s, %s, %.2f\n", lastName, firstName,
						department, salary);
			}

			System.out.println();
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			close(myStmt, myRs);
		}

	}

	private static void close(Connection myConn, Statement myStmt,
			ResultSet myRs) throws SQLException {
		if (myRs != null) {
			myRs.close();
		}

		if (myStmt != null) {
			myStmt.close();
		}

		if (myConn != null) {
			myConn.close();
		}
	}

	private static void close(Statement myStmt, ResultSet myRs)
			throws SQLException {

		close(null, myStmt, myRs);
	}

}
