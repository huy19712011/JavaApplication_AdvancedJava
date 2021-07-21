/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.connection_pool;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author huynq
 */
public class ConnectionPoolWithConfigFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

            Context context = new InitialContext();
            DataSource datasource = (DataSource) context.lookup("java:comp/env/myds");

            Connection connection = datasource.getConnection();
            System.out.println(connection);

        } catch (NamingException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionPoolWithConfigFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
