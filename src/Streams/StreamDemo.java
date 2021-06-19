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

        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        movies.forEach(movie -> {
            System.out.println(movie.getTitle());
        });

        // map()
        movies.stream()
                .map(movie -> movie.getTitle())
                .forEach(name -> System.out.println(name));
                //.forEach(System.out::println);

        // mapToInt()
        movies.stream()
                .mapToInt(movie -> movie.getLikes())
                //.map(movie -> movie.getTitle())
                .forEach(name -> System.out.println(name));


        // using flat map
        // Stream<List<x>> -> Stream<x>
        // Stream<Set<x>> -> Stream<x>
        // Stream<ArrayList<x>> -> Stream<x>

//        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
//        stream.forEach(list -> System.out.println(list)); // print [1 2 3] [4 5 6]

        var stream = Stream.of(List.of(1, 2, 3), Arrays.asList(4, 5, 6));
        stream
                .flatMap(list -> list.stream())
                .forEach(list -> System.out.println(list)); // print 1 2 3 4 5 6




    }

}
