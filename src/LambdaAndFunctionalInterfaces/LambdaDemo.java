/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaAndFunctionalInterfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

/**
 *
 * @author huynq
 */
public class LambdaDemo {

    public static void show() {

//        Supplier<Double> getRandom = () -> {return Math.random();};

//        Supplier<Double> getRandom = () -> Math.random();

        Supplier<Double> getRandom = Math::random;

        // calling
        var random = getRandom.get();
        System.out.println(random);

        // with primitive types: DoubleSupplier, IntSupplier, BooleanSupplier, ...
        DoubleSupplier g = Math::random;
        System.out.println(g.getAsDouble());

    }

}
