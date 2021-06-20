/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author huynq
 */
public class ExceptionsDemo {

    public static void show() {

        sayHello(null);
    }

    public static void sayHello(String name) {

        System.out.println("Hello " + name.toUpperCase());
    }


}
