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

//    public static void print(String message) { System.out.println(message);} // match with method in interface

//    public void print(String message) {System.out.println(message);};

    public LambdaDemo(String message) {

    }

    public static void show() {

        List<Integer> list = List.of(1, 2, 3);

/*
    // Imperative Programming (for, if/else, switch/case)
*/

//        for (var item: list) {
//            System.out.println(item);
//        }

/*
    // Declarative Programming
*/

//        list.forEach((Integer item) -> {System.out.println(item);});

//        list.forEach(item -> {System.out.println(item);});

//        list.forEach(new Consumer<Integer>() {

//            @Override
//            public void accept(Integer item) {
//                System.out.println(item);
//            }
//        });

//        list.forEach(item -> System.out.println(item));

        list.forEach(System.out::println);
    }

}
