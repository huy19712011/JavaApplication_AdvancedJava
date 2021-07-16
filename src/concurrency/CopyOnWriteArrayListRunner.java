/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author huynq
 */
public class CopyOnWriteArrayListRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<String>();

        // add - copy
        // get

        // Threads - 3
        list.add("a");
        list.add("b");
        list.add("c");

        // Threads - 10 000
        for (String element: list) {
            System.out.println(element);
        }

    }

}
