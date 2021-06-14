/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaAndFunctionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author huynq
 */
public class LambdaDemo {

    public static void show() {

        List<String> list = List.of("a", "b", "c");

        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

//        list.forEach(print.andThen(printUpperCase));

        //
        list.forEach(print.andThen(printUpperCase).andThen(print));

    }

}
