/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author huynq
 */
public class ExceptionsDemo {

    public static void show() {

        var account = new Account(); // balance = 0;
        try {
            account.withdraw(10);
        } catch (AccountException ex) {

            //ex.printStackTrace(System.err);
            var cause = ex.getCause();
            System.out.println(cause);
        }

    }

}
