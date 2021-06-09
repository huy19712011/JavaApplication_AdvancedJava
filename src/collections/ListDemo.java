/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author huynq
 */
public class ListDemo {
    public static void show() {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //
        Collections.addAll(list, "d", "e", "f");

        //
        list.add(3, "A");
        System.out.println(list);

        //
        System.out.println(list.get(3));

        //
        list.set(3, "AAA");
        System.out.println(list);

        //
//        list.remove(3);
//        list.remove("a");
//        System.out.println(list);

        //
        System.out.println(list.indexOf("c"));
        System.out.println(list.indexOf("a1"));
        System.out.println(list.lastIndexOf("a"));

        //
        System.out.println(list.subList(0, 2));
    }
}
















