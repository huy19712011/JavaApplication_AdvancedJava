/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

/**
 *
 * @author huynq
 */
public class ConcurrentMapRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Map<Character, LongAdder> occurances
//                = new Hashtable<>();
//
//        String str = "abcd abcd abcd";
//
//        for (char character: str.toCharArray()) {
//            LongAdder longAdder = occurances.get(character);
//            if (longAdder == null) {
//                longAdder = new LongAdder();
//            }
//            longAdder.increment();
//            occurances.put(character, longAdder);
//        }
//
//        System.out.println(occurances);

        ConcurrentMap<Character, LongAdder> occurances
                = new ConcurrentHashMap<>();

        String str = "abcd abcd abcd";

        for (char character: str.toCharArray()) {
            occurances
                    .computeIfAbsent(character, ch -> new LongAdder())
                    .increment();
        }

        System.out.println(occurances);

    }

}
