/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaAndFunctionalInterfaces;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author huynq
 */
public class LambdaDemo {

    public static void show() {

        BinaryOperator<Integer> add = (a, b) -> a + b;
        var result = add.apply(1, 2);
        System.out.println(result);

        // if many use
        IntBinaryOperator add2 = (a, b) -> a + b;
        result = add2.applyAsInt(3, 4);
        System.out.println(result);

        // a,b -> a+b -> square
        // combining
        Function<Integer, Integer> square = a -> a * a;
        result = add.andThen(square).apply(1, 2);
        System.out.println(result);
    }

}
