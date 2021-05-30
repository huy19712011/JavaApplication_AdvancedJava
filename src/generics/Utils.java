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
public class Utils {
//    public static int max(int first, int second) {
//        return (first > second) ? first : second;
//    }

//    public static <T> T max(T first, T second) {
//        return (first > second) ? first : second;
//    }

    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second : first;
    }
}
