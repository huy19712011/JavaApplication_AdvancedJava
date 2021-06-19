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
        //System.out.println(movies);

        // Intermediate: map(), filter()
        var filtered = movies.stream()
                .filter(m -> m.getLikes() > 10);

        // Terminal: forEach()
        filtered.forEach(m -> System.out.println(m.getLikes()));

        //
        Predicate<Movie> isPopular = m -> m.getLikes() > 20;
        filtered = movies.stream().filter(isPopular);
        filtered.forEach(m -> System.out.println(m.getTitle()));

        // source data is not affected
        System.out.println(movies);

    }

}
