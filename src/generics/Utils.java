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


//    public static void print(int key, int value) {
//        System.out.println(key + " = " + value);
//    }

    public static <K, V, T> void print(K key, V value, T test) {
        System.out.println(key + " + " + value + " = " + test);
    }


    public static void printUser(User user) {
        System.out.println(user);
    }


//    public static void printUsers(GenericList<User> users) {
//        // do something
//    }

//    public static void printUsers(GenericList<?> users) {
//        // do something
//        Object x = users.get(0);
//    }

//    public static void printUsers(GenericList<? extends User> users) {
//        // do something
//        User x = users.get(0);
//
////        Instructor y = users.get(0); // error
//    }

    public static void printUsers(GenericList<? super User> users) {
        // do something
//        User x = users.get(0); // error
        users.add(new User(10));
        users.add(new Instructor(20));

        Object x = users.get(0);
//        User y = users.get(0); // error
    }





}
