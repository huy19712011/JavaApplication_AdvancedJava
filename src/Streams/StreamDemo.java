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

        //
        var count = movies.stream()
                .count();
        System.out.println(count);

        //anyMatch
//        boolean result = movies.stream()
//                .anyMatch(m -> m.getLikes() > 20);
//        System.out.println(result);

        //allMatch
//        boolean result = movies.stream()
//                .allMatch(m -> m.getLikes() > 20);
//        System.out.println(result);

        //noneMatch
//        boolean result = movies.stream()
//                .noneMatch(m -> m.getLikes() > 20);
//        System.out.println(result);

        //findFirst
//        var result = movies.stream()
//                .findFirst()
//                .get();
//        System.out.println(result.getTitle());

        //findAny
//        var result = movies.stream()
//                .findAny()
//                .get();
//        System.out.println(result.getTitle());

        //max
//        var result = movies.stream()
//                .max(Comparator.comparing(Movie::getLikes))
//                .get();
//        System.out.println(result.getTitle());

        //min
        var result = movies.stream()
                .min(Comparator.comparing(Movie::getLikes))
                .get();
        System.out.println(result.getTitle());


    }

}








