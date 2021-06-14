/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaAndFunctionalInterfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 *
 * @author huynq
 */
public class LambdaDemo {

    public static void show() {

        // "key:value"
        // 1 "key=value"
        // 2 "{key=value}"
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        // 2 ways to combine functions
        // 1st way
        // 1a
        var combinedFun = replaceColon.andThen(addBraces);
        var result = combinedFun.apply("key:value");
        System.out.println(result);

        //1b
        result = replaceColon.andThen(addBraces).apply("key:value");
        System.out.println(result);


        // 2nd way
        result = addBraces.compose(replaceColon).apply("key:value");
        System.out.println(result);

    }

}
