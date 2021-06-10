/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author huynq
 */
public class SetDemo {

    public static void show() {
        //
//        Set<String> set = new HashSet<>();
//        set.add("sky");
//        set.add("is");
//        set.add("blue");
//        set.add("blue");
//        System.out.println(set);

        //
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "c");
        Set<String> set = new HashSet<>(collection);
        System.out.println(set);

        //
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        // union
//        set1.addAll(set2);
//        System.out.println(set1);

        // intersection
//        set1.retainAll(set2);
//        System.out.println(set1);

        // different
        set1.removeAll(set2);
        System.out.println(set1);

    }

}






