/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author huynq
 */
public class User implements Comparable<User> {

// Comparable without T
//    @Override
//    public int compareTo(Object o) {
//
//    }
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {

        // this < other -> -1
        // this = other -> 0
        // this > other -> +1

//        if (points < other.points)
//            return -1;
//        if (points == other.points)
//            return 0;
//        return 1;


        return points - other.points;
    }

}
