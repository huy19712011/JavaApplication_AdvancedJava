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

        Function<String, Integer> map = str -> str.length();

        var length = map.apply("For Testing");
        System.out.println(length);

        // types: apply(T t)
//        BiFunction<Thread, UnknownError, R>
//        IntFunction<R>
//        IntToLongFunction
//        ToIntFunction<T>


    }

}
