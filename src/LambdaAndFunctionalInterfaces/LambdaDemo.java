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
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author huynq
 */
public class LambdaDemo {

    public static void show() {

        // "test" -> have 5 or more characters
        Predicate<String> isLongerThan5 = str -> str.length() > 5;

        var result = isLongerThan5.test("test");
        System.out.println(result);

    }

}
