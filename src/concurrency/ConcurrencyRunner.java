/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrency;

/**
 *
 * @author huynq
 */
public class ConcurrencyRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println(counter.getI());
    }

}
