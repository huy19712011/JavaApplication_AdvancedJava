/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author huynq
 */
public class StreamDemo {

    public static void show() {

        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        // find movies having likes > 10
/*
    // Imperative programming
*/
        int count = 0;
        for (var movie: movies) {
            if (movie.getLikes() > 10) {
                count++;
            }
        }
        System.out.println(count);

/*
    // Declarative programming
*/

        var count2 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();
        System.out.println(count2);
    }

}
