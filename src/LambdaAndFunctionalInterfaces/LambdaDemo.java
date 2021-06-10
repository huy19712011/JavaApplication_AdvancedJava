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

        greet(message -> System.out.println(message));

//        Printer printer = new ConsolePrinter();
        Printer printer = message -> System.out.println(message);
        greet(printer);

    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
