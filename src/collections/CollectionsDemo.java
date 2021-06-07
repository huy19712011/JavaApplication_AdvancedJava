/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author huynq
 */
public class CollectionsDemo {

    public static void show() {

        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        for (var item : collection) {
            System.out.println(item);
        }
        System.out.println(collection);

        //
        Collections.addAll(collection, "d", "e", "f");
        System.out.println(collection);

        //
        System.out.println(collection.size());

        //
        collection.remove("a");
        System.out.println(collection);

        // remove all items
//        collection.clear();

        //
        System.out.println(collection.isEmpty());

        //
        collection.contains("b");

        //
        Object[] objectArray = collection.toArray();

        //
        String[] strArray = collection.toArray(new String[5]); // 0
        String toUpperCase = strArray[0].toUpperCase();
        System.out.println(toUpperCase);


        //
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection == other); // false
        System.out.println(collection.equals(other)); // true


    }

}
