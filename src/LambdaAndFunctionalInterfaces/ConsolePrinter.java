/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaAndFunctionalInterfaces;

/**
 *
 * @author huynq
 */
public class ConsolePrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println(message);
    }

}
