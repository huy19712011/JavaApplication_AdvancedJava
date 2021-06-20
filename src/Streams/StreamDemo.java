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
import java.util.stream.Stream;

/**
 *
 * @author huynq
 */
public class StreamDemo {

    public static void show() {

        var movies = List.of(
                new Movie("a", 10, Genre.THRILLER),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 30, Genre.ACTION)
        );


        //
        Map<Genre, List<Movie>> result = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre));
        System.out.println(result);

        //
        Map<Genre, Set<Movie>> result2 = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.toSet()));
        System.out.println(result2);

        //
        Map<Genre, Long> result3 = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
        System.out.println(result3);

        //
        Map<Genre, String> result4 = movies.stream()
                .collect(Collectors.groupingBy(
                        Movie::getGenre,
                        Collectors.mapping(Movie::getTitle, Collectors.joining(", ")))
                );
        System.out.println(result4);


    }

}








