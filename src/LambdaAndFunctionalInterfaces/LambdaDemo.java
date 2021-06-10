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
public class LambdaDemo {

    public static void show() {
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println("Hello World");
            }
        });
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
