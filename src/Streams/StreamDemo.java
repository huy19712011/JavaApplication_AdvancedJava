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
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );



        //
        List<Movie> list = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toList());

        //
        Set<Movie> set = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toSet());

        // map
        // key (title)
        // value (likes)
        Map<String, Integer> map = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toMap(m -> m.getTitle(), m -> m.getLikes()));
        System.out.println(map);

        // using method reference
        Map<String, Movie> map2 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toMap(Movie::getTitle, Function.identity()));
        System.out.println(map2);


        //summingInt
        var result = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.summingInt(Movie::getLikes));
        System.out.println(result);

        //summarizingInt
        var result2 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.summarizingInt(Movie::getLikes));
        System.out.println(result2);

        //
        var result3 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .map(Movie::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println(result3);


    }

}








