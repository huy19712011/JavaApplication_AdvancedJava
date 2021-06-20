/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author huynq
 */
public class ExceptionsDemo {

    public static void show() {

        try {
            var reader = new FileReader("file.txt");
            System.out.println("File opened");

        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist");
            System.out.println(ex.getMessage());
        }

        //System.out.println("File opened");

    }

}
