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
public class Counter {

    private int i = 0;

    synchronized public void increment() {
        i++;
    }

    public int getI() {
        return i;
    }


}
