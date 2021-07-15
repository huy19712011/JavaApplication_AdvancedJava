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
public class BiCounter {

    private int i = 0;
    private int j = 0;

    synchronized public void incrementI() {
        i++;
    }

    synchronized public void incrementJ() {
        j++;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }


}
