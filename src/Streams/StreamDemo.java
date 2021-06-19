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

        // limit()
        movies.stream()
                .limit(2)
                .forEach(m -> System.out.println(m.getTitle()));

        // skip()
        movies.stream()
                .skip(2)
                .forEach(m -> System.out.println(m.getTitle()));

        // using limit() and skip() to pagination
        // 1000 movies
        // 10 movies per page (pageSize)
        // show 3rd page
        // skip(20) = skip((page-1) * pageSize)
        // limit(10) = limit(pageSize)
        movies.stream()
                .skip(20)
                .limit(10)
                .forEach(m -> System.out.println(m.getTitle()));

        // takeWhile()
        movies.stream()
                .takeWhile(m -> m.getLikes() < 30)
                .forEach(m -> System.out.println(m.getTitle()));

        // takeWhile vs filter
        // filter: loop over all elements
        // takeWhile: loop until condition
        // example a=10, b=30, c=20 -> print only a

        //dropWhile() <> takeWhile()
        movies.stream()
                .dropWhile(m -> m.getLikes() < 30)
                .forEach(m -> System.out.println(m.getTitle()));
    }

}
