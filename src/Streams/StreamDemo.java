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
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author huynq
 */
public class StreamDemo {

    public static void show() {

/*
    // when working with primitive types:
       use IntStream, LongStream, DoubleStream, => more efficient than Stream
*/


        //
        IntStream.of(1, 2, 3);

        // print 1 .. 5
        IntStream.rangeClosed(1, 5)
                .forEach(System.out::println);

        // print 1 .. 4
        IntStream.range(1, 5)
                .forEach(System.out::println);
    }

}








