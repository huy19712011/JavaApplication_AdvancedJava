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
                new Movie("b", 10),
                new Movie("a", 20),
                new Movie("c", 30)
        );

        // way 1
        // using sorted() and Movie implements Comparable
        movies.stream()
                .sorted()
                .forEach(movie -> System.out.println(movie.getTitle()));

        // way 2
        // using sorted(comparator) and Movie implements Comparator
        movies.stream()
                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                //.sorted(Comparator.comparing(m -> m.getTitle()))
                .forEach(movie -> System.out.println(movie.getTitle()));

        // more ...
        movies.stream()
                .sorted(Comparator.comparing(m -> m.getTitle()))
                .forEach(movie -> System.out.println(movie.getTitle()));

        // more ... using method reference
        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle))
                .forEach(movie -> System.out.println(movie.getTitle()));

        // DESC using reversed()
        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(movie -> System.out.println(movie.getTitle()));


    }

}








