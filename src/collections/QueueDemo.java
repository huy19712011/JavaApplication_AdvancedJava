/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author huynq
 */
public class QueueDemo {

    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        // b->a->c
        System.out.println(queue);

        //
        queue.offer("d"); //d->b->a->c
        System.out.println(queue);

        // the same as element(), but return null
        var front = queue.peek();
        System.out.println(front);

        // the same as peek(), but throws Exception
        var e = queue.element();

        //the same as poll(), but throws Exception
        queue.remove();
        System.out.println(queue);

        // the same as remove(), but return null
        queue.poll();
    }


}










