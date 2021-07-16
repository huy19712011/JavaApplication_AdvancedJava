/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author huynq
 */
public class BiCounterWithAtomicInteger {

    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();

    public void incrementI() {

        i.incrementAndGet();
    }

    public void incrementJ() {

        j.incrementAndGet();
    }

    public int getI() {
        return i.get();
    }

    public int getJ() {
        return j.get();
    }


}
