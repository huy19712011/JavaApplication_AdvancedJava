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

//    public static void print(String message) { System.out.println(message);} // match with method in interface

//    public void print(String message) {System.out.println(message);};

    public LambdaDemo(String message) {

    }

    public static void show() {

//        greet(message -> System.out.println(message));
//        greet(System.out::println); // method reference

        // Class/object::method

//        greet(message -> print(message));
//        greet(LambdaDemo::print);

//        var demo = new LambdaDemo();
//        greet(message -> demo.print(message));
//        greet(demo::print);


        greet(message -> new LambdaDemo(message));
        greet(LambdaDemo::new);


    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
