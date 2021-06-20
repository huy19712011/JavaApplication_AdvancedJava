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
        Map<Boolean, List<Movie>> result = movies.stream()
                .collect(Collectors.partitioningBy(m -> m.getLikes() > 20));
        System.out.println(result);


        //
        Map<Boolean, String> result2 = movies.stream()
                .collect(Collectors.partitioningBy(m -> m.getLikes() > 20,
                                                   Collectors.mapping(Movie::getTitle,
                                                                      Collectors.joining(", ")))
                );
        System.out.println(result2);


    }

}








