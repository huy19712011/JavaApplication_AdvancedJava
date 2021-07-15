/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author huynq
 */
public class BiCounterWithLock {

    private int i = 0;
    private int j = 0;

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    public void incrementI() {
        lockForI.lock();// get lock for i
        try {
            i++;
        } finally {
            lockForI.unlock();// release lock for i
        }
    }

    public void incrementJ() {
        lockForJ.lock();
        try {
            j++;
        } finally {
            lockForJ.unlock();
        }
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }


}
