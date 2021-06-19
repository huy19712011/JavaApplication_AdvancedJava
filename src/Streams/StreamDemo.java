/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author huynq
 */
public class StreamDemo {

    public static void show() {

        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        // way 1: using Optional<T>
        // after map: [10 20 30]
        //            [30, 30]
        //            [60]
        Optional<Integer> sum = movies.stream()
                .map(m -> m.getLikes())
                //.reduce((a, b) -> a + b);
                //.reduce((a, b) -> Integer.sum(a, b));
                .reduce(Integer::sum);
        System.out.println(sum.orElse(0));

        // way 2: not use Optional<T>
        Integer sum2 = movies.stream()
                .map(m -> m.getLikes())
                .reduce(0, Integer::sum);
        System.out.println(sum2);

    }

}








