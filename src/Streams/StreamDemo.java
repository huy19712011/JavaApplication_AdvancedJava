/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author huynq
 */
public class StreamDemo {

    public static void show() {

        // from collections
        Collection<Integer> list = new ArrayList<>();
        list.stream();

        // from arrays
        int[] numbers = {1, 2, 3};
        //numbers.stream() // do not have
        Arrays.stream(numbers)
                .forEach(System.out::println);

        // from a arbitrany number of objects
        // Stream.of(1, 2, 3, 4, "a").forEach(System.out::println);
        Stream.of(1, 2, 3, 4, "asd").forEach(obj -> System.out.println(obj));

        // infinite
        var stream = Stream.generate(() -> Math.random());
        // stream.forEach(System.out::println);

        // finite
        stream.limit(3)
                .forEach(System.out::println);

        //
        Stream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(System.out::println);

        //
        Stream.iterate("a", c -> {
            var cc = (char) (c.charAt(0) + 1);
            return String.valueOf(cc);
        })
                .limit(5)
                .forEach(System.out::println);


    }

}
